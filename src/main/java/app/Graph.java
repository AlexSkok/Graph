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
    public void addVertex(int vertex){
        if (!adjacencyList.containsKey(vertex)){
            adjacencyList.put(vertex, new ArrayList<>());
            System.out.println("Вершина " + vertex + " успішно додана");
        } else {
            System.out.println("Вершина " + vertex + " вжу існує");
        }
    }

    private void displayGraph(){
        for (Map.Entry<Integer, List<Integer>> element : adjacencyList.entrySet()){
            System.out.println(element.getValue() + " : " + element.getValue());
        }
    }
}
