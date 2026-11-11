package DSA.Graphs;

class Dijkstra_Algo {

    static int v = 5;

    // Find the univisited vertex min distance
    static int findMinVertex(int[] distance, boolean[] visited) {
        int min = Integer.MAX_VALUE; // instead of infinity we can use
        int vertex = -1;

        for (int i = 0; i < v; i++) {
            if (!visited[i] && distance[i] < min && distance[i] != 0) {
                min = distance[i];
                vertex = i;
            }
        }
        return vertex;
    }

    void dijkstra(int[][] graph, int source) {
        int[] distance = new int[v];
        boolean[] visited = new boolean[v];

        // Initially all distances are infinity
        for (int i = 0; i < v; i++) {
            distance[i] = Integer.MAX_VALUE;

        }
        // we have to process all nodes
        for (int count = 0; count < v - 1; count++) {
            int u = findMinVertex(distance, visited);

            // Check if remaining vertices are unreachable
            if (u == -1) {
                break;
            }
            visited[u] = true;

            for (int j = 0; j < v; j++) {
                if (!visited[v]
                        && graph[u][j] != 0
                        && distance[u] != Integer.MAX_VALUE
                        && distance[u] + graph[u][j] < distance[j]) {
                    distance[j] = distance[u] + graph[u][j];
                }
            }
        }
        System.out.println("shortest distance ");
        for (int i = 0; i < v; i++) {
            System.out.print(i + " " + distance[i]);
        }
    }
}

public class DijkstraAlgo {
    public static void main(String[] args) {
        Dijkstra_Algo obj = new Dijkstra_Algo();
        int[][] graph = {
                { 0, 4, 10, 0, 0 },
                { 4, 0, 0, 3, 0 },
                { 10, 0, 0, 2, 5 },
                { 0, 3, 2, 0, 4 },
                { 0, 0, 5, 4, 0 }
        };
        obj.dijkstra(graph, 0);

    }
}