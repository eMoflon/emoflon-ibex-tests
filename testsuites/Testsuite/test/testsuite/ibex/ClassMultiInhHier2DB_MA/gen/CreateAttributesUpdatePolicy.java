package testsuite.ibex.ClassMultiInhHier2DB_MA.gen;

import java.util.Optional;

import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.operational.matches.ImmutableMatchContainer;
import org.emoflon.ibex.tgg.operational.updatepolicy.UpdatePolicy;

import classMultipleInheritanceHierarchy.Clazz;


/*This update policy prefers adding attribute first to super class. If super class already have an
 * attribute, then all other attributes are added to subclass*/

public class CreateAttributesUpdatePolicy extends UpdatePolicy {

	@Override
	public IMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {	
		return forceClassCreation(matchContainer)
				.orElse(forceInheritanceCreation(matchContainer)
				.orElse(getNonAttributeMatch(matchContainer)
				.orElse(getAttributeMatchForEmptySuperClass(matchContainer)
				.orElse(getAttributeMatchForSubClass(matchContainer)
				.orElse(matchContainer.getNextRandom())))));
	}

	protected Optional<IMatch> forceClassCreation(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> match = matchContainer.getMatches()
				.stream()
				.filter(m -> m.patternName().equals("ClassToTable__GEN"))
				.findAny();
		return match;
	}
	
	protected Optional<IMatch> forceInheritanceCreation(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> match = matchContainer.getMatches()
				.stream()
				.filter(m -> m.patternName().equals("SubClassToTable__GEN"))
				.findAny();
		return match;
	}

	protected Optional<IMatch> getNonAttributeMatch(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> match = matchContainer.getMatches()
				  .stream()
				  .filter(m -> ! m.patternName().equals("AttributeToColumn__GEN"))
				  .findAny();
		return match;
	}

	protected Optional<IMatch> getAttributeMatchForSubClass(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> match = matchContainer.getMatches()
		  		.stream()
		  		.filter(m -> m.patternName().equals("AttributeToColumn__GEN"))
		  		.filter(m -> {
					Clazz clazz = (Clazz) m.get("clazz");
					return !clazz.getSuperClass().isEmpty();
				})
				.findAny();
		return match;
	}

	protected Optional<IMatch> getAttributeMatchForEmptySuperClass(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> match = matchContainer.getMatches()
				.stream()
				.filter(m -> m.patternName().equals("AttributeToColumn__GEN"))
				.filter(m -> {
					Clazz clazz = (Clazz) m.get("clazz");
					return clazz.getSuperClass().isEmpty() && clazz.getAttributes().isEmpty();
				})
				.findAny();
		return match;
	}
}
