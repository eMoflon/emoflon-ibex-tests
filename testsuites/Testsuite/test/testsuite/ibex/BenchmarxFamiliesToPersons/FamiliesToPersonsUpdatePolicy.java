package testsuite.ibex.BenchmarxFamiliesToPersons;

import java.util.HashSet;
import java.util.Set;

import org.benchmarx.Configurator;
import org.emoflon.ibex.tgg.compiler.patterns.PatternSuffixes;
import org.emoflon.ibex.tgg.operational.util.IMatch;
import org.emoflon.ibex.tgg.operational.util.ImmutableMatchContainer;
import org.emoflon.ibex.tgg.operational.util.UpdatePolicy;

import testsuite.ibex.testUtil.Decisions;

public class FamiliesToPersonsUpdatePolicy extends UpdatePolicy {

	private Configurator<Decisions> configurator;
	
	public FamiliesToPersonsUpdatePolicy(Configurator<Decisions> configurator) {
		this.configurator = configurator;
	}

	@Override
	public IMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {
		Set<IMatch> matches = new HashSet<IMatch>(matchContainer.getMatches());
		matches.removeIf(this::isIrrelevantMatchForSync);
				
		handlePrefsForExistingFamily(matches);
		handlePrefsForParents(matches);

		return matches.isEmpty()? matchContainer.getNextRandom() : matches.iterator().next();
	}

	private boolean isIrrelevantMatchForSync(IMatch m) {
		return m.patternName().endsWith(PatternSuffixes.CONSISTENCY);
	}

	private void handlePrefsForExistingFamily(Set<IMatch> matches) {
		if (configurator.decide(Decisions.PREFER_EXISTING_FAMILY_TO_NEW)) {
			if(thereIsAtLeastOneExistingFamily(matches))
				matches.removeIf(m -> !usesExistingFamily(m));
		} else {
			matches.removeIf(this::usesExistingFamily);
		}
	}

	private boolean thereIsAtLeastOneExistingFamily(Set<IMatch> matches) {
		return matches.stream().anyMatch(this::usesExistingFamily);
	}
	
	private boolean usesExistingFamily(IMatch m) {
		return m.patternName().contains("Existing");
	}

	private void handlePrefsForParents(Set<IMatch> matches) {
		if (configurator.decide(Decisions.PREFER_CREATING_PARENT_TO_CHILD)) {
			if(atLeastOneParentCanBeCreated(matches))
				matches.removeIf(this::isChildRule);
		} else if(atLeastOneChildCanBeCreated(matches))
			matches.removeIf(this::isParentRule);
	}
	
	private boolean atLeastOneParentCanBeCreated(Set<IMatch> matches) {
		return matches.stream().anyMatch(this::isParentRule);
	}

	private boolean isParentRule(IMatch m) {
		return m.patternName().contains("Mother") || m.patternName().contains("Father");
	}

	private boolean isChildRule(IMatch m) {
		return m.patternName().contains("Son") || m.patternName().contains("Daughter");
	}

	private boolean atLeastOneChildCanBeCreated(Set<IMatch> matches) {
		return matches.stream().anyMatch(this::isChildRule);
	}
}
