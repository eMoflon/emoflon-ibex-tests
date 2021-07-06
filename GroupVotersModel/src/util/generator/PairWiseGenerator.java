package util.generator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import groupVotersModel.Group;
import groupVotersModel.GroupVotersContainer;
import groupVotersModel.Voter;
import util.visualization.VoterModelUi;

public class PairWiseGenerator extends GroupVotersModelGenerator{
	
	protected double connectRate;
	
	public PairWiseGenerator() {
		super();
	}
	
	public PairWiseGenerator(int seed) {
		super(seed);
	}
	
	@Override
	public GroupVotersContainer generate(String path, boolean display, String label) {
		GroupVotersContainer model = this.generate(path);
		if(display) {
			VoterModelUi ui = new VoterModelUi(model, label);
			ui.display();
		}
		return model;
	}
	
	@Override
	public GroupVotersContainer generate(String path) {
		this.generate();
		saveToFile(path, model);
		return model;
	}
	
	@Override
	public GroupVotersContainer generate() {
		model = factory.createGroupVotersContainer();
		
		genVoters();
		model.getVoter().addAll(voters);
		
		this.genGroups();
		model.getGroup().addAll(groups);
		
		System.out.println("Num of Voters: "+voters.size());
		System.out.println("Num of Groups: "+groups.size());
		return model;
	}
	
	@Override
	protected void genGroups() {
		List<Group> groups = new LinkedList<>();
		
		for(int i = 0; i<voters.size(); i++) {
			Voter v1 = voters.get(i);
			for(int j = i+1; j<voters.size(); j++) {
				if(rnd.nextDouble() > connectRate)
					continue;
				
				Voter v2 = voters.get(j);
				Group g = factory.createGroup();
				groups.add(g);
				
				v1.getMember().add(g);
				v2.getMember().add(g);
			}
		}
		
		this.groups = new ArrayList<>(groups);
	}
	
	public void setConnectRate(final double rate) {
		this.connectRate = rate;
	}
	
	

}
