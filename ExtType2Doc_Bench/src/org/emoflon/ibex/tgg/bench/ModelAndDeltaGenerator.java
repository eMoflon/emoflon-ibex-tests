package org.emoflon.ibex.tgg.bench;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.bench.util.BenchParameters;

public abstract class ModelAndDeltaGenerator<CorrFactory extends EFactory, SrcFactory extends EFactory, TrgFactory extends EFactory, BenchParams extends BenchParameters> {

	public final String SEP = "_";
	
	protected final Resource source;
	protected final Resource target;
	protected final Resource corr;
	protected final Resource protocol;

	protected final Resource delta;

	protected final SrcFactory sFactory = srcFactoryInstance();
	protected final TrgFactory tFactory = trgFactoryInstance();
	protected final CorrFactory cFactory = corrFactoryInstance();

	protected BenchParams parameters;

	protected int numOfElements;

	public ModelAndDeltaGenerator(Resource source, Resource target, Resource corr, Resource protocol, Resource delta) {
		this.numOfElements = 0;

		this.source = source;
		this.target = target;
		this.corr = corr;
		this.protocol = protocol;

		this.delta = delta;
	}

	protected abstract SrcFactory srcFactoryInstance();

	protected abstract TrgFactory trgFactoryInstance();

	protected abstract CorrFactory corrFactoryInstance();
	
	protected abstract void clearAll();

	protected abstract void genModel();

	protected abstract void genDelta();

	public void gen(BenchParams parameters) {
		this.parameters = parameters;
		clearAll();
		genModel();
		genDelta();
	}

	public int getNumOfElements() {
		return numOfElements;
	}
	
	protected EObject createCorr(EObject corr, EObject src, EObject trg) {
		this.corr.getContents().add(corr);
		corr.eSet(corr.eClass().getEStructuralFeature("Source"), src);
		corr.eSet(corr.eClass().getEStructuralFeature("Target"), trg);
		return corr;
	}

}
