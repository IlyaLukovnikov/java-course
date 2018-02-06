package ru.graph;

public class Vertex {
    private int number;

    boolean wasVisited;
    int parent;

    // Constructor
    public Vertex(int number) {
        this.number = number;
        wasVisited = false;
        parent = -1;
    }

    public int getNumber() {
        return number;
    }
}
