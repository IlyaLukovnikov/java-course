package ru.graph;

public class Main
{
    public static void main(String[] args) {
        UndirectedGraph unDirectedGraph = new UndirectedGraph(100);

        unDirectedGraph.addVertex(0);
        unDirectedGraph.addVertex(1);
        unDirectedGraph.addVertex(2);
        unDirectedGraph.addVertex(3);
        unDirectedGraph.addVertex(4);
        unDirectedGraph.addVertex(5);
        unDirectedGraph.addVertex(6);
        unDirectedGraph.addVertex(7);

        unDirectedGraph.addEdge(0, 1);
        unDirectedGraph.addEdge(0, 2);
        unDirectedGraph.addEdge(0, 7);
        unDirectedGraph.addEdge(1, 4);
        unDirectedGraph.addEdge(1, 6);
        unDirectedGraph.addEdge(2, 3);
        unDirectedGraph.addEdge(2, 4);
        unDirectedGraph.addEdge(3, 5);
        unDirectedGraph.addEdge(3, 4);
        unDirectedGraph.addEdge(4, 5);
        unDirectedGraph.addEdge(4, 6);
        unDirectedGraph.addEdge(5, 6);
        System.out.println();

        unDirectedGraph.getPath(0, 6);
        System.out.println();


        DirectedGraph directedGraph = new DirectedGraph(100);
        directedGraph.addVertex(0);
        directedGraph.addVertex(1);
        directedGraph.addVertex(2);
        directedGraph.addVertex(3);
        directedGraph.addVertex(4);
        directedGraph.addEdge(0, 4);
        directedGraph.addEdge(4, 2);
        directedGraph.addEdge(2, 3);
        directedGraph.addEdge(3, 2);
        directedGraph.addEdge(3, 1);
        directedGraph.addEdge(3, 0);

        System.out.println();
        directedGraph.getPath(0, 4);
        System.out.println();
    }
}
