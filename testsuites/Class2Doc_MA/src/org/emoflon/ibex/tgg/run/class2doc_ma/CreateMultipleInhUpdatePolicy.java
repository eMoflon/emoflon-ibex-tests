package org.emoflon.ibex.tgg.run.class2doc_ma;

import java.util.Optional;

import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.operational.matches.ImmutableMatchContainer;

import classMultipleInheritanceHierarchy.Clazz;

public class CreateMultipleInhUpdatePolicy extends CreateAttributesUpdatePolicy{
	
	@Override
	public IMatch chooseOneMatch(ImmutableMatchContainer matchContainer) {	
		return forceClassCreation(matchContainer)
				.orElse(forceInheritanceCreation(matchContainer)
				.orElse(matchContainer.getNext()));
	}
	
	@Override
	protected Optional<IMatch> forceInheritanceCreation(ImmutableMatchContainer matchContainer) {
		Optional<IMatch> match = matchContainer.getMatches()
				.stream()
				.filter(m -> m.getPatternName().equals("SubClass2SubDoc__GEN"))
				.filter(m -> {
					Clazz clazz = (Clazz) m.get("superClass");
					Clazz sub = (Clazz) m.get("subClass");
					return !clazz.getSuperClass().isEmpty() && !clazz.getSuperClass().contains(sub);
				})
				.findAny();
		return match;
	}
}