package app;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(7);
        graph.addVertex(8);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);
        graph.addEdge(3, 5);
        graph.displayGraph();
    }
}