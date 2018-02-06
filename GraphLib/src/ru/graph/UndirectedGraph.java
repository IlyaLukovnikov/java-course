package ru.graph;

public class UndirectedGraph {

    private int vertexCount;
    private Vertex[] vertexList;
    protected int[][] listAdjacency;

    // Constructor
    public UndirectedGraph(int vertexMaxCount) {
        vertexCount = 0;
        vertexList = new Vertex[vertexMaxCount];
        listAdjacency = new int[vertexMaxCount][vertexMaxCount];

        for (int i = 0; i < vertexMaxCount; i++) {
            for (int j = 0; j < vertexMaxCount; j++) {
                listAdjacency[i][j] = 0;
            }
        }
    }

    //Functions
    public void addVertex(int number) {
        vertexList[vertexCount++] = new Vertex(number);
    }

    public void addEdge(int begin, int end) {
        listAdjacency[begin][end] = 1;
        listAdjacency[end][begin] = 1;
    }

    public void getParents(int vertex) {
        int v = vertexList[vertex].parent;
        if (v == -1) {
            return;
        }
        System.out.print("" + v + " ");
        getParents(v);
    }

    public void getPath(int start, int end) {
        Queue queue = new Queue();

        for (int j = 0; j < vertexCount; j++) {
            vertexList[j].wasVisited = false;
        }

        if (vertexList[start] == null) {
            System.out.println("Не существует вершины с номером " + start);
            return;
        }

        queue.insert(start);
        vertexList[start].wasVisited = true;
        while (true) {
            if(queue.isEmpty()) {
                System.out.println("Путь не найден");
                break;
            }
            if(start == end) {
                System.out.println("Путь найден: ");
                System.out.print( vertexList[start].getNumber() + " ");
                getParents(start);
                break;
            }
            int vertex = queue.remove();
            for (int adjVertex = 0; adjVertex < vertexCount; adjVertex++) {
                if (listAdjacency[vertex][adjVertex] == 1 && !vertexList[adjVertex].wasVisited) {
                    queue.insert(adjVertex);
                    vertexList[adjVertex].wasVisited = true;
                    vertexList[adjVertex].parent = vertex;

                    if (adjVertex == end) start = adjVertex;
                }
            }
        }
    }
}
