package util.generator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import GroupVotersModel.Voter;
import util.visualization.VoterModelUi;
import GroupVotersModel.Group;
import GroupVotersModel.GroupVotersContainer;
import GroupVotersModel.GroupVotersModelFactory;


public class GroupVotersModelGenerator {
	
	protected GroupVotersModelFactory factory = GroupVotersModelFactory.eINSTANCE;
	protected String outputPath;
	protected GroupVotersContainer model;
	protected Random rnd = new Random();
	

	protected int numOfVoters;
	protected int numOfGroups;
	protected double falseRate;
	protected ArrayList<Voter> voters;
	protected ArrayList<Group> groups;
	
	public GroupVotersModelGenerator() {}
	
	public GroupVotersModelGenerator(int seed) {
		rnd = new Random(seed);
	}
	
	public GroupVotersContainer generate(String path) {
		generate();
		saveToFile(path, model);
		return model;
	}
	
	public GroupVotersContainer generate() {
		model = factory.createGroupVotersContainer();
		
		genVoters();
		model.getVoter().addAll(voters);
		
		genGroups();
		model.getGroup().addAll(groups);
		
		for(Group group : groups) {
			Voter v1 = voters.get(rnd.nextInt(voters.size()));
			Voter v2 = null;
			
			do {
				v2 = voters.get(rnd.nextInt(voters.size()));
			} while (v1 == v2);
			
			v1.getMember().add(group); v1.setNoOfMemberships(v1.getNoOfMemberships()+1);
			v2.getMember().add(group); v2.setNoOfMemberships(v2.getNoOfMemberships()+1);
			group.setSize(2);
		}
		
		return model;
	}
	
	public GroupVotersContainer generate(String path, boolean display, String label) {
		GroupVotersContainer model = generate(path);
		if(display) {
			VoterModelUi ui = new VoterModelUi(model, label);
			ui.display();
		}
		return model;
	}
	
	public void setNumOfVoters(final int num) {
		this.numOfVoters = num;
	}
	public void setNumOfGroups(final int num) {
		this.numOfGroups = num;
	}
	
	public void setFalseRate(final double rate) {		
		this.falseRate = rate;
	}
	
	protected void genVoters() {
		List<Voter> voters = new LinkedList<>();
		for(int i = 0; i<numOfVoters; i++) {
			Voter voter = factory.createVoter();
			voter.setNoOfMemberships(0);
			voter.setId(i);
			if(rnd.nextDouble()<falseRate) {
				voter.setVote(0);
			} else {
				voter.setVote(1);
			}
			voters.add(voter);
		}
		
		this.voters = new ArrayList<>(voters);
	}
	
	protected void genGroups() {
		List<Group> groups = new LinkedList<>();
		for(int i = 0; i<numOfGroups; i++) {
			Group group1 = factory.createGroup();
			group1.setId(i);
			groups.add(group1);
		}
		this.groups = new ArrayList<>(groups);
	}
	
	public static void saveToFile(final String outputPath, GroupVotersContainer model) {
		URI uri = URI.createFileURI(outputPath);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource modelResource = rs.createResource(uri);
		
		modelResource.getContents().add(model);
		
		Map<Object, Object> saveOptions = ((XMIResource)modelResource).getDefaultSaveOptions();
		saveOptions.put(XMIResource.OPTION_ENCODING,"UTF-8");
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION,Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
		
		try {
			((XMIResource)modelResource).save(saveOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}
		modelResource.getContents().remove(model);
		modelResource.unload();
		
		System.out.println("Model saved to: "+uri.path());
	}
	
	public static double calcConnectRate(int numOfVoters, int expectedAvgNumOfGroups) {
		double numOfUniqueUnorderedPairs = numOfVoters * (numOfVoters - 1) / 2;
		return expectedAvgNumOfGroups / numOfUniqueUnorderedPairs;
	}

}
