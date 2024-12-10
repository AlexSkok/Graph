package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }
//    add vertex----------
    public void addVertex(int vertex){
        if (!adjacencyList.containsKey(vertex)){
            adjacencyList.put(vertex, new ArrayList<>());
            System.out.println("Вершина " + vertex + " успішно додана");
        } else {
            System.out.println("Вершина " + vertex + " вжу існує");
        }
    }
//    add edge------------
    public void addEdge(int source, int destination){
        if (!adjacencyList.containsKey(source)){
            addVertex(source);
        }
        if (!adjacencyList.containsKey(destination)){
            addVertex(destination);
        }
        if (!adjacencyList.get(source).contains(destination)){
            adjacencyList.get(source).add(destination);
        }
        if (!adjacencyList.get(destination).contains(source)){
            adjacencyList.get(destination).add(source);
        }
    }
//    remove vertex-------
    public void  removeVertex(int vertex){
        for (int neighbor : adjacencyList.get(vertex)){
            adjacencyList.get(neighbor).remove(vertex);
        }
        adjacencyList.remove(vertex);
        System.out.println("Vertex " + vertex + " is deleted");
    }
//    remove edge--------
    public void removeEdge(int source, int destination){
        if (adjacencyList.containsKey(source) && adjacencyList.get(source).contains(destination)){
            adjacencyList.get(source).remove(destination);
        }
        if (adjacencyList.containsKey(destination) && adjacencyList.get(destination).contains(source)){
            adjacencyList.get(destination).remove(source);
        }
    }
//    has vertex--------
    public void hasVertex(int vertex){

    }

    public void displayGraph(){
        for (Map.Entry<Integer, List<Integer>> element : adjacencyList.entrySet()){
            System.out.println(element.getKey() + " : " + element.getValue());
        }
    }
}
