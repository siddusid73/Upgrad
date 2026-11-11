package DSA.Graphs;

import java.util.*;

public class DijkstraAlgoArrList {

    static class Edge {
        int destionation;
        int weight;

        Edge(int dest, int w) {
            this.destionation = dest;
            this.weight = w;
        }
    }

    static class Pair implements Comparable<Pair> {
        int vertex;
        int distance;

        Pair(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.vertex, other.vertex);
        }
    }

    static void dijkstra(ArrayList<ArrayList<Edge>> graph, int source) {
        int vertices = graph.size();

        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(source, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();

            int u = current.vertex;

            for (Edge edge : graph.get(u)) {
                int v = edge.destionation;
                int weight = edge.weight;

                if (distance[u] + weight < distance[v]) {
                    distance[v] = distance[u] + weight;
                    pq.add(new Pair(v, distance[v]));
                }
            }
        }
        System.out.println("vertex\tdistance");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + "\t" + distance[i]);
        }
    }

    public static void main(String[] args) {
        int vertices = 5;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // graph
        graph.get(0).add(new Edge(1, 4));
        graph.get(0).add(new Edge(2, 10));

        graph.get(1).add(new Edge(3, 3));

        graph.get(3).add(new Edge(2, 2));
        graph.get(3).add(new Edge(4, 4));

        graph.get(2).add(new Edge(4, 5));

        dijkstra(graph, 0);
    }
}
