package testsuite.ibex.ClassMultiInhHier2DB_MA.gen;

import java.util.Optional;

import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.operational.matches.ImmutableMatchContainer;

import classMultipleInheritanceHierarchy.Clazz;

public class CreateMultipleInhUpdatePolicy extends CreateAttributesUpdatePolicy{
	@Override
	protected Optional<IMatch> forceInheritanceCreation(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> match = matchContainer.getMatches()
				.stream()
				.filter(m -> m.getPatternName().equals("SubClassToTable__GEN"))
				.filter(m -> {
					Clazz clazz = (Clazz) m.get("subClazz");
					return !clazz.getSuperClass().isEmpty();
				})
				.findAny();
		return match;
	}
}
