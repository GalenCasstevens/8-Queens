import java.util.ArrayList;

public class Node implements Comparable<Node> {
	public Queen[] state;
	private ArrayList<Node> neighbors;
	private int heuristic;
	
	public Node() {
		state = new Queen[8];
		neighbors = new ArrayList<Node>();
	}
	
	public Node(Node n) {
		state = new Queen[8];
		neighbors = new ArrayList<Node>();
		
		for(int i = 0; i < 8; i++) {
			state[i] = new Queen(n.state[i].getRow(), n.state[i].getColumn());
		}
		
		heuristic = 9;
	}
	
	public ArrayList<Node> generateNeighbors(Node startState) {
		int count = 0;
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				neighbors.add(count, new Node(startState));
				neighbors.get(count).start[i].moveUp
			}
		}
	}
	
	public int getHeuristic() {
		return heuristic;
	}
	
	public int compareTo(Node n) {
		if(this.heuristic < n.getHeuristic()) return -1;
		else if(this.heuristic > n.getHeuristic()) return 1;
		else return 0;
	}
}
