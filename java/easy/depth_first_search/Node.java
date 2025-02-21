package main.java.com.example.depthfirstsearch;

import java.util.ArrayList;
import java.util.List;

// Class representing a node in an acyclic tree-like structure (a directed acyclic graph in this case).
// Each node has a name and a list of children (connected nodes).
public class Node {
	String name;  // Name of the current node.
	List<Node> children = new ArrayList<Node>();  // List to hold child nodes.

	// Constructor to initialize a node with a given name.
	public Node(String name) {
		this.name = name;
	}

	// Method to perform Depth-First Search (DFS) traversal.
	// O(v + e) time | O(v) space;
	// where v is the number of vertices in the input graph and e is the number of edges in the input graph
	public List<String> depthFirstSearch(List<String> array) {
		array.add(this.name);  // Add the current node's name to the traversal list.
		for (Node child : this.children) {  // Traverse all child nodes recursively.
			child.depthFirstSearch(array);
		}
		return array;  // Return the final DFS traversal list.
	}

	// Method to add a child node to the current node.
	public Node addChild(String name) {
		Node child = new Node(name);  // Create a new child node.
		children.add(child);  // Add the new child node to the list of children.
		return this;  // Return the current instance to support method chaining.
	}
}