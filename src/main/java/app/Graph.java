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

    public void displayGraph(){
        for (Map.Entry<Integer, List<Integer>> element : adjacencyList.entrySet()){
            System.out.println(element.getKey() + " : " + element.getValue());
        }
    }
}
