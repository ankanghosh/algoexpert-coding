package main.java.com.example.depthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class Main {
	// Main function to create a sample graph and perform Depth-First Search (DFS) traversal.
	// O(v + e) time | O(v) space, where v is the number of vertices in the input graph and e is the number of edges in the input graph
	public static void main(String[] args) {
		// Construct the test graph.
		Node graph = new Node("A");
		graph.addChild("B").addChild("C").addChild("D");
		graph.children.get(0).addChild("E").addChild("F");
		graph.children.get(0).children.get(1).addChild("I").addChild("J");
		graph.children.get(2).addChild("G").addChild("H");
		graph.children.get(2).children.get(0).addChild("K");

		// Call the depthFirstSearch() function and get the result.
		List<String> result = graph.depthFirstSearch(new ArrayList<>());

		// Output the DFS traversal result.
		System.out.println("DFS traversal result: " + result);
	}
}