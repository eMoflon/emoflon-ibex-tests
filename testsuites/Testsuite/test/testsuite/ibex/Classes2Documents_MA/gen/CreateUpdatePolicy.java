package testsuite.ibex.Classes2Documents_MA.gen;

import java.util.Optional;

import org.emoflon.ibex.tgg.operational.util.IMatch;
import org.emoflon.ibex.tgg.operational.util.ImmutableMatchContainer;
import org.emoflon.ibex.tgg.operational.util.UpdatePolicy;


/*This update policy prefers adding attribute first to super class. If super class already have an
 * attribute, then all other attributes are added to subclass*/

public class CreateUpdatePolicy extends UpdatePolicy {

	@Override
	public IMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {	
		return forceClassCreation(matchContainer)
				.orElse(forceInheritanceCreation(matchContainer)
				.orElse(matchContainer.getNextRandom()));
	}

	protected Optional<IMatch> forceClassCreation(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> match = matchContainer.getMatches()
				.stream()
				.filter(m -> m.patternName().equals("Class2Doc__GEN"))
				.findAny();
		return match;
	}
	
	protected Optional<IMatch> forceInheritanceCreation(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> match = matchContainer.getMatches()
				.stream()
				.filter(m -> m.patternName().equals("SubClass2SubDoc__GEN"))
				.findAny();
		return match;
	}
}
