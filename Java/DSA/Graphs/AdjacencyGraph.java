package DSA.Graphs;

class Graph {
    int[][] matrix;
    int vertices;

    Graph(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    // add undirected edge
    void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    void display() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class AdjacencyGraph{
    public static void main(String[] args){
        Graph graph = new Graph(5);

        graph.addEdge(0,1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.display();
    }
}
