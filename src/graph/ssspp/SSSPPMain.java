package graph.ssspp;


import graph.ssspp.adjacencymatrix.Graph;
import graph.ssspp.adjacencymatrix.GraphNode;

import java.util.ArrayList;

public class SSSPPMain {
    public static void main(String[] args) {
        /*
            Single Source Shortest Path Problem
         */
        ArrayList<GraphNode> noodes = new ArrayList<>();
        noodes.add(new GraphNode("A", 0));
        noodes.add(new GraphNode("B", 1));
        noodes.add(new GraphNode("C", 2));
        noodes.add(new GraphNode("D", 3));
        noodes.add(new GraphNode("E", 4));
        noodes.add(new GraphNode("F", 5));
        noodes.add(new GraphNode("G", 6));
        Graph graph = new Graph(noodes);
        graph.addDirectedEdge(0, 1);
        graph.addDirectedEdge(0, 2);
        graph.addDirectedEdge(1, 3);
        graph.addDirectedEdge(1, 6);
        graph.addDirectedEdge(2, 3);
        graph.addDirectedEdge(2, 4);
        graph.addDirectedEdge(3, 5);
        graph.addDirectedEdge(4, 5);
        graph.addDirectedEdge(5, 6);
        System.out.println(graph.toString());
        graph.BFSForSSSPP(noodes.get(0));

    }
}
