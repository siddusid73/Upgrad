package DSA.Graphs;

class GraphDFS {
    int[][] matrix;
    int vertices;

    GraphDFS(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    // add edge
    void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    void dfs(int start) {
        boolean[] visited = new boolean[vertices];

        dfsRecursive(start, visited);
    }

    void dfsRecursive(int current, boolean[] visited) {
        // mark the current vertex as visited
        visited[current] = true;

        System.out.println(current + " ");

        // check neighbour nodes
        for (int i = 1; i <= vertices; i++) {
            if (matrix[current][i] == 1 && !visited[i]) {
                dfsRecursive(i, visited);
            }
        }
    }
}

public class DFS_graph {
    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        graph.dfs(0);
    }
}
