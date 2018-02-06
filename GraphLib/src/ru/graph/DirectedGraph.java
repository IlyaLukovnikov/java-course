package ru.graph;

public class DirectedGraph extends UndirectedGraph {
    public DirectedGraph(int count) {
        super(count);
    }

    public void addEdge(int begin, int end) {
        listAdjacency[begin][end] = 1;
    }
}
