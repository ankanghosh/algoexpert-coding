# Class representing a node in an acyclic tree-like structure (a directed acyclic graph in this case).
# Each node has a name and a list of children (connected nodes).
class Node:
    # Constructor to initialize a node with a given name.
    # Initializes an empty list to store child nodes.
    def __init__(self, name):
        self.children = []  # List to hold child nodes.
        self.name = name  # Name of the current node.

    # Function to add a child node to the current node.
    def addChild(self, name):
        self.children.append(Node(name))  # Create and add a new child node.
        return self  # Return self to support method chaining.

    # Function to perform Depth-First Search (DFS) traversal.
    # O(v + e) time | O(v) space;
    # where v is the number of vertices (nodes) in the graph and e is the number of edges (connections)
    def depthFirstSearch(self, array):
        array.append(self.name)  # Add the current node's name to the traversal list.
        for child in self.children:  # Traverse all child nodes recursively.
            child.depthFirstSearch(array)
        return array  # Return the final DFS traversal list.