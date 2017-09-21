package testsuite.ibex.BenchmarxFamiliesToPersons;

import java.util.HashSet;
import java.util.Set;

import org.benchmarx.Configurator;
import org.emoflon.ibex.tgg.compiler.patterns.PatternSuffixes;
import org.emoflon.ibex.tgg.operational.util.IMatch;
import org.emoflon.ibex.tgg.operational.util.ImmutableMatchContainer;
import org.emoflon.ibex.tgg.operational.util.UpdatePolicy;

import testsuite.ibex.testUtil.Decisions;

public class FamiliesToPersonsUpdatePolicy implements UpdatePolicy {

	private Configurator<Decisions> configurator;
	
	public FamiliesToPersonsUpdatePolicy(Configurator<Decisions> configurator) {
		this.configurator = configurator;
	}

	@Override
	public IMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {
		Set<IMatch> matches = new HashSet<IMatch>(matchContainer.getMatches());
		matches.removeIf(m -> m.patternName().endsWith(PatternSuffixes.CONSISTENCY));
		
		if (thereIsAtLeastOneExistingFamily(matchContainer))
			handlePrefsForExistingFamily(matches);

		if (atLeastOneParentCanBeCreated(matchContainer))
			handlePrefsForParents(matches);

		if (matches.isEmpty())
			return matchContainer.getNextRandom();
		else {
			return matches.iterator().next();
		}
	}

	private boolean atLeastOneParentCanBeCreated(ImmutableMatchContainer matchContainer) {
		return matchContainer.getMatches().stream().filter(m -> m.patternName().contains("Mother") || m.patternName().contains("Father")).count() >= 1;
	}

	private boolean thereIsAtLeastOneExistingFamily(ImmutableMatchContainer matchContainer) {
		return matchContainer.getMatches().stream().filter(m -> m.patternName().contains("Existing")).count() >= 1;
	}

	public void handlePrefsForExistingFamily(Set<IMatch> matches) {
		if (configurator.decide(Decisions.PREFER_EXISTING_FAMILY_TO_NEW)) {
			matches.removeIf(m -> !m.patternName().contains("Existing"));
		} else {
			matches.removeIf(m -> m.patternName().contains("Existing"));
		}
	}
	
	public void handlePrefsForParents(Set<IMatch> matches) {
		if (configurator.decide(Decisions.PREFER_CREATING_PARENT_TO_CHILD)) {
			matches.removeIf(m -> m.patternName().contains("Son") || m.patternName().contains("Daughter"));
		} else {
			matches.removeIf(m -> m.patternName().contains("Mother") || m.patternName().contains("Father"));
		}
	}


}
