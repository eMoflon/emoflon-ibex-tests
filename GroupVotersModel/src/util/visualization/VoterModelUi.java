package util.visualization;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.geom.Point2;
import org.graphstream.ui.geom.Point3;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.Viewer;
import org.graphstream.ui.view.camera.Camera;

import GroupVotersModel.Group;
import GroupVotersModel.GroupVotersContainer;
import GroupVotersModel.Voter;

public class VoterModelUi {
	private GroupVotersContainer container;
	private String label;
	private Graph graph;
	private Map<Voter, Node> voters2vertices = new HashMap<>();
	private Map<Group, Node> groups2vertices = new HashMap<>();
	private Map<Group, Set<Voter>> group2voters = new HashMap<>();
	private int voterCounter = 0;
	private int groupCounter = 0;
	
	public VoterModelUi(final GroupVotersContainer container, final String label) {
		this.container = container;
		this.label = label;
		System.setProperty("org.graphstream.ui", "swing");
		buildGraphVisualization();
	}
	
	public void display() {
		Viewer v = graph.display(true);
//		final Viewer viewer = graph.display(true);
//		viewer.enableAutoLayout();
//		final View view = viewer.getDefaultView();
//		view.getCamera().setViewPercent(1);
//		((Component) view).addMouseWheelListener(new MouseWheelListener() {
//		    @Override
//		    public void mouseWheelMoved(MouseWheelEvent e) {
//		        e.consume();
//		        int i = e.getWheelRotation();
//		        double factor = Math.pow(1.25, i);
//		        Camera cam = view.getCamera();
//		        double zoom = cam.getViewPercent() * factor;
//		        Point2 pxCenter  = cam.transformGuToPx(cam.getViewCenter().x, cam.getViewCenter().y, 0);
//		        Point3 guClicked = cam.transformPxToGu(e.getX(), e.getY());
//		        double newRatioPx2Gu = cam.getMetrics().ratioPx2Gu/factor;
//		        double x = guClicked.x + (pxCenter.x - e.getX())/newRatioPx2Gu;
//		        double y = guClicked.y - (pxCenter.y - e.getY())/newRatioPx2Gu;
//		        cam.setViewCenter(x, y, 0);
//		        cam.setViewPercent(zoom);
//		    }
//		});
	}
	
	private void buildGraphVisualization() {
		graph = new MultiGraph(label);
		for(Voter v : container.getVoter()) {
			Node gsNode = graph.addNode("V#"+Integer.toString(voterCounter++));
			voters2vertices.put(v, gsNode);
			
			if(v.getVote() > 0) {
				gsNode.setAttribute("ui.style", "fill-color: rgb(000,155,000); text-size: 12; size: 20px; text-style: bold;");
			} else {
				gsNode.setAttribute("ui.style", "fill-color: rgb(155,000,000); text-size: 12; size: 20px; text-style: bold;");
			}
			
			for(Group g : v.getMember()) {
				Set<Voter> otherMembers = group2voters.get(g);
				if(otherMembers == null) {
					otherMembers = new HashSet<>();
					group2voters.put(g, otherMembers);
				}
				otherMembers.add(v);
			}
			
			gsNode.setAttribute("ui.label", gsNode.getId());
		}
		
		for(Group g : container.getGroup()) {
			Node gsNode = graph.addNode("G#"+Integer.toString(groupCounter++));
			groups2vertices.put(g, gsNode);
			if(!group2voters.containsKey(g)) {
				gsNode.setAttribute("ui.style", "fill-color: rgb(255,255,255); shape: rounded-box; stroke-color: rgb(000,155,155); stroke-width: 4px; stroke-mode: plain; text-size: 12; size: 20px; text-style: bold;");
			} else {
				int vote = -1;
				boolean homogeneous = true;
				for(Voter member : group2voters.get(g)) {
					Node gsMember = voters2vertices.get(member);
					graph.addEdge(gsMember.getId()+"->"+gsNode.getId(), gsMember.getId(), gsNode.getId());
					if(vote == -1) {
						vote = member.getVote();
					} else {
						int tempVote = member.getVote();
						if(tempVote != vote) {
							homogeneous = false;
						}
					}
				}
				
				if(homogeneous) {
					if(vote == 0) {
						gsNode.setAttribute("ui.style", "fill-color: rgb(255,255,255); shape: rounded-box; stroke-color: rgb(155,000,000); stroke-width: 4px; stroke-mode: plain; text-size: 12; size: 20px; text-style: bold;");
					} else {
						gsNode.setAttribute("ui.style", "fill-color: rgb(255,255,255); shape: rounded-box; stroke-color: rgb(000,155,000); stroke-width: 4px; stroke-mode: plain; text-size: 12; size: 20px; text-style: bold; ");
					}
				} else {
					gsNode.setAttribute("ui.style", "fill-color: rgb(255,255,255); shape: rounded-box; stroke-color: rgb(195,195,195); stroke-width: 4px; stroke-mode: plain; text-size: 12; size: 20px; text-style: bold; ");
				}
			}
			
			gsNode.setAttribute("ui.label", gsNode.getId());
		}
	}
	
	public static int booleanToInt(boolean bool) {
		if(bool) {
			return 1;
		} else {
			return 0;
		}
	}
}
