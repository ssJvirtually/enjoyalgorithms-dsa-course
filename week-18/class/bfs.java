import java.util.*;
import java.util.stream.Collectors;

public class bfs {


    public static void main(String[] args) {
     int v = 5 ;
     int[][] adj= {{1,2,3},{},{4},{},{}};

        List<List<Integer>> adjList = Arrays.stream(adj)
                .map(row -> Arrays.stream(row).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList());
        ArrayList<Integer> integers = bfsOfGraph(v, adjList);

        System.out.println(integers);
    }



    public static ArrayList<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        // Set to track visited nodes
        Set<Integer> visited = new HashSet<>();
        // Queue for BFS traversal
        Queue<Integer> queue = new LinkedList<>();
        // Result list to store BFS traversal order
        ArrayList<Integer> result = new ArrayList<>();

        // Start BFS from node 0
        queue.add(0);

        // Iterate until the queue is empty
        while (!queue.isEmpty()) {
            // Dequeue a node
            int currentNode = queue.poll();
            // If the node is not visited
            if (!visited.contains(currentNode)) {
                // Add the node to the result list
                result.add(currentNode);
                // Mark the node as visited
                visited.add(currentNode);

                // Iterate over all neighbors of the current node
                for (int neighbor : adj.get(currentNode)) {
                    // If the neighbor is not visited, enqueue it
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }

        // Return the BFS traversal result
        return result;
    }
}
