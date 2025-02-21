from node import Node

# Function to create a sample graph and perform Depth-First Search (DFS) traversal.
# O(v + e) time | O(v) space;
# where v is the number of vertices in the input graph and e is the number of edges in the input graph
def run_tests():
    # Construct the test graph.
    graph = Node("A")
    graph.addChild("B").addChild("C").addChild("D")
    graph.children[0].addChild("E").addChild("F")
    graph.children[0].children[1].addChild("I").addChild("J")
    graph.children[2].addChild("G").addChild("H")
    graph.children[2].children[0].addChild("K")

    # Call the depthFirstSearch() function and get the result.
    result = graph.depthFirstSearch([])

    # Output the DFS traversal result.
    print(f"DFS traversal result: {result}")

# Execute the test case if this script is run directly.
if __name__ == "__main__":
    run_tests()
