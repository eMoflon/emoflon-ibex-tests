package testsuite.ibex.Class2TestClass_MA.sync.util;

import java.util.HashSet;
import java.util.Set;

import org.emoflon.ibex.tgg.compiler.patterns.PatternSuffixes;
import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.operational.matches.ImmutableMatchContainer;
import org.emoflon.ibex.tgg.operational.updatepolicy.UpdatePolicy;
import org.emoflon.ibex.tgg.util.MAUtil;

public class PreferExistingClassUpdatePolicy extends UpdatePolicy{
	
	@Override
	public IMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {
		Set<IMatch> matches = new HashSet<IMatch>(matchContainer.getMatches());
		matches.removeIf(this::isIrrelevantMatchForSync);
				
		handlePrefsForExistingClass(matches);

		return matches.isEmpty()? matchContainer.getNextRandom() : matches.iterator().next();
	}

	private boolean isIrrelevantMatchForSync(IMatch m) {
		return m.getPatternName().endsWith(PatternSuffixes.CONSISTENCY);
	}

	private void handlePrefsForExistingClass(Set<IMatch> matches) {
		if(thereIsAtLeastOneExistingClass(matches))
				matches.removeIf(m -> !usesExistingClass(m));
		else {
			matches.removeIf(this::usesExistingClass);
		}
	}

	private boolean thereIsAtLeastOneExistingClass(Set<IMatch> matches) {
		return matches.stream().anyMatch(this::usesExistingClass);
	}
	
	private boolean usesExistingClass(IMatch m) {
		return ! (m.getPatternName().contains(MAUtil.FUSED));
	}


}
