package graph.dijkstra;

import java.util.ArrayList;

public class DijkstraMain {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodes = new ArrayList<>();
        nodes.add(new WeightedNode("A", 0));
        nodes.add(new WeightedNode("B", 1));
        nodes.add(new WeightedNode("C", 2));
        nodes.add(new WeightedNode("D", 3));
        nodes.add(new WeightedNode("E", 4));
        nodes.add(new WeightedNode("F", 5));
        nodes.add(new WeightedNode("G", 6));
        WeightedGraph graph = new WeightedGraph(nodes);
        graph.addWeightedEdge(0, 1, 2);
        graph.addWeightedEdge(0, 2, 5);
        graph.addWeightedEdge(1, 2, 6);
        graph.addWeightedEdge(1, 3, 1);
        graph.addWeightedEdge(1, 4, 3);
        graph.addWeightedEdge(2, 5, 8);
        graph.addWeightedEdge(2, 4, 4);
        graph.addWeightedEdge(4, 6, 9);
        graph.addWeightedEdge(5, 6, 7);
        System.out.println("Printing Dijkstra from source A");
        graph.dijkstra(nodes.get(0));
    }
}
