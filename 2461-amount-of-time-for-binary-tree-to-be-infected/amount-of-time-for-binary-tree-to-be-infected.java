class Solution {
    public int amountOfTime(TreeNode root, int start) { 
        Map<Integer, Set<Integer>> adjacencyMap = new HashMap<>(); // Graph representation of tree
        convert(root, 0, adjacencyMap); // Convert tree into graph format   
        Queue<Integer> infectionQueue = new LinkedList<>(); // BFS queue for infected nodes
        infectionQueue.add(start); // Start infection from the given node
        
        int minutesElapsed = 0; // Time counter
        Set<Integer> infectedNodes = new HashSet<>(); // Track visited (infected) nodes
        infectedNodes.add(start); // Mark start node as infected

        while (!infectionQueue.isEmpty()) { // BFS traversal
            int nodesInCurrentMinute = infectionQueue.size(); // Number of nodes to process this minute
            while (nodesInCurrentMinute > 0) { // Process all nodes in current minute
                int currentNode = infectionQueue.poll(); // Get current infected node

                for (int neighbor : adjacencyMap.get(currentNode)) { // Check all connected nodes
                    if (!infectedNodes.contains(neighbor)) { // If not yet infected
                        infectedNodes.add(neighbor); // Mark as infected
                        infectionQueue.add(neighbor); // Add to queue for next minute
                    }
                }
                nodesInCurrentMinute--; // Move to next node in current batch
            }
            minutesElapsed++; // One minute passes after processing this batch
        }
        return minutesElapsed - 1; // Subtract 1 because last increment happens after infection finishes
    }

    void convert(TreeNode currentNode, int parentNode, Map<Integer, Set<Integer>> adjacencyMap) { // Convert tree into undirected graph
        if (currentNode == null) { // Base case
            return;
        } 
        if (!adjacencyMap.containsKey(currentNode.val)) { // Create adjacency list entry if absent
            adjacencyMap.put(currentNode.val, new HashSet<>());
        }
        Set<Integer> connections = adjacencyMap.get(currentNode.val); // Get list of connected nodes
        
        if (parentNode != 0) { // If not root, connect to parent
            connections.add(parentNode);
        } 
        if (currentNode.left != null) { // Connect to left child
            connections.add(currentNode.left.val);
        } 
        if (currentNode.right != null) { // Connect to right child
            connections.add(currentNode.right.val);
        }
        
        convert(currentNode.left, currentNode.val, adjacencyMap); // Recurse left
        convert(currentNode.right, currentNode.val, adjacencyMap); // Recurse right
    }
}
