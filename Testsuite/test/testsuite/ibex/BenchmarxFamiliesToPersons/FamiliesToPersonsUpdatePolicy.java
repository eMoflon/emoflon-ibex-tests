package testsuite.ibex.BenchmarxFamiliesToPersons;

import java.util.HashSet;
import java.util.Set;

import org.benchmarx.Configurator;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.tgg.compiler.patterns.PatternSuffixes;
import org.emoflon.ibex.tgg.operational.matches.ITGGMatch;
import org.emoflon.ibex.tgg.operational.matches.ImmutableMatchContainer;
import org.emoflon.ibex.tgg.operational.updatepolicy.UpdatePolicy;

import testsuite.ibex.testUtil.Decisions;

public class FamiliesToPersonsUpdatePolicy extends UpdatePolicy {

	private Configurator<Decisions> configurator;
	
	public FamiliesToPersonsUpdatePolicy(Configurator<Decisions> configurator) {
		this.configurator = configurator;
	}

	@Override
	public ITGGMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {
		Set<ITGGMatch> matches = new HashSet<ITGGMatch>(matchContainer.getMatches());
		matches.removeIf(this::isIrrelevantMatchForSync);
				
		handlePrefsForExistingFamily(matches);
		handlePrefsForParents(matches);

		return matches.isEmpty()? matchContainer.getNext() : matches.iterator().next();
	}

	private boolean isIrrelevantMatchForSync(ITGGMatch m) {
		return m.getPatternName().endsWith(PatternSuffixes.CONSISTENCY);
	}

	private void handlePrefsForExistingFamily(Set<ITGGMatch> matches) {
		if (configurator.decide(Decisions.PREFER_EXISTING_FAMILY_TO_NEW)) {
			if(thereIsAtLeastOneExistingFamily(matches))
				matches.removeIf(m -> !usesExistingFamily(m));
		} else {
			matches.removeIf(this::usesExistingFamily);
		}
	}

	private boolean thereIsAtLeastOneExistingFamily(Set<ITGGMatch> matches) {
		return matches.stream().anyMatch(this::usesExistingFamily);
	}
	
	private boolean usesExistingFamily(ITGGMatch m) {
		return m.getPatternName().contains("Existing");
	}

	private void handlePrefsForParents(Set<ITGGMatch> matches) {
		if (configurator.decide(Decisions.PREFER_CREATING_PARENT_TO_CHILD)) {
			if(atLeastOneParentCanBeCreated(matches))
				matches.removeIf(this::isChildRule);
		} else if(atLeastOneChildCanBeCreated(matches))
			matches.removeIf(this::isParentRule);
	}
	
	private boolean atLeastOneParentCanBeCreated(Set<ITGGMatch> matches) {
		return matches.stream().anyMatch(this::isParentRule);
	}

	private boolean isParentRule(ITGGMatch m) {
		return m.getPatternName().contains("Mother") || m.getPatternName().contains("Father");
	}

	private boolean isChildRule(ITGGMatch m) {
		return m.getPatternName().contains("Son") || m.getPatternName().contains("Daughter");
	}

	private boolean atLeastOneChildCanBeCreated(Set<ITGGMatch> matches) {
		return matches.stream().anyMatch(this::isChildRule);
	}
}
