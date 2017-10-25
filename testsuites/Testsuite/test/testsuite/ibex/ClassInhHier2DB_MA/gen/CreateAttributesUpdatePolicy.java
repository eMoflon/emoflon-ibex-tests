package testsuite.ibex.ClassInhHier2DB_MA.gen;

import java.util.Optional;

import org.emoflon.ibex.tgg.operational.util.IMatch;
import org.emoflon.ibex.tgg.operational.util.ImmutableMatchContainer;
import org.emoflon.ibex.tgg.operational.util.UpdatePolicy;

import ClassInheritanceHierarchy.Clazz;

public class CreateAttributesUpdatePolicy extends UpdatePolicy {

	@Override
	public IMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {		
		return getAttributeMatchForEmptySuperClass(matchContainer)
				.orElse(getAttributeMatchForSubClass(matchContainer)
				.orElse(getNonAttributeMatch(matchContainer)
				.orElse(matchContainer.getNextRandom())));
	}

	private Optional<IMatch> getNonAttributeMatch(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> findMatch = matchContainer.getMatches()
				  .stream()
				  .filter(m -> ! m.patternName().equals("AttributeToColumnRule__GEN"))
				  .findAny();
		return findMatch;
	}

	private Optional<IMatch> getAttributeMatchForSubClass(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> match = matchContainer.getMatches()
		  		.stream()
		  		.filter(m -> m.patternName().equals("AttributeToColumnRule__GEN"))
		  		.filter(m -> {
					Clazz clazz = (Clazz) m.get("clazz");
					return clazz.getSuperClass() != null;
				})
				.findAny();
		return match;
	}

	private Optional<IMatch> getAttributeMatchForEmptySuperClass(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> match = matchContainer.getMatches()
				.stream()
				.filter(m -> m.patternName().equals("AttributeToColumnRule__GEN"))
				.filter(m -> {
					Clazz clazz = (Clazz) m.get("clazz");
					return clazz.getSuperClass() == null && clazz.getAttributes().isEmpty();
				})
				.findAny();
		return match;
	}
}
