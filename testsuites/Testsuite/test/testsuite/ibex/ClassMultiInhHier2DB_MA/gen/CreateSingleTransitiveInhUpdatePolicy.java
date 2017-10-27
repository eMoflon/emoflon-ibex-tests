package testsuite.ibex.ClassMultiInhHier2DB_MA.gen;

import java.util.Optional;

import org.emoflon.ibex.tgg.operational.util.IMatch;
import org.emoflon.ibex.tgg.operational.util.ImmutableMatchContainer;
import org.emoflon.ibex.tgg.operational.util.UpdatePolicy;

import classMultipleInheritanceHierarchy.Clazz;

public class CreateSingleTransitiveInhUpdatePolicy extends CreateAttributesUpdatePolicy{
	@Override
	public IMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {	
		return forceClassCreation(matchContainer)
				.orElse(forceInheritanceCreation(matchContainer)
				.orElse(getNonAttributeMatch(matchContainer)
				.orElse(getAttributeMatchForEmptySuperClass(matchContainer)
				.orElse(getAttributeMatchForSubClass(matchContainer)
				.orElse(matchContainer.getNextRandom())))));
	}
	
	@Override
	protected Optional<IMatch> forceInheritanceCreation(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> match = matchContainer.getMatches()
				.stream()
				.filter(m -> m.patternName().equals("SubClassToTable__GEN"))
				.filter(m -> {
					Clazz clazz = (Clazz) m.get("subClazz");
					return clazz.getSuperClass().isEmpty();
				})
				.findAny();
		return match;
	}
}
