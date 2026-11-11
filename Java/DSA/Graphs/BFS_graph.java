package DSA.Graphs;

import java.util.LinkedList;
import java.util.Queue;

class BFSgraph {
    int[][] matrix;
    int vertices;

    BFSgraph(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    // add edge
    void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    // BFS
    void breadthFirstSearch(int start) {
        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            System.out.print(current + " ");

            // check all the unvisited neibours
            for (int i = 1; i <= vertices; i++) {

                if (matrix[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }
}

public class BFS_graph {
    public static void main(String[] args) {
        BFSgraph graph = new BFSgraph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        graph.breadthFirstSearch(0);
    }
}
