/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbvweightedgraph;

/**
 *
 * @author Christiaan Bouwer
 */
public class DbvWeightedGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        MyGraph graph = new MyGraph(n);

        // add edges
        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 2, 2);
        graph.addEdge(0, 3, 1);
        graph.addEdge(1, 3, 4);
        graph.addEdge(1, 4, 7);
        graph.addEdge(2, 4, 6);

        System.out.println(graph.toString());

        System.out.println("dfs");
        graph.dfs(); // depth first search

        System.out.println("bfs");
        graph.bfs(); // breadth first search        
        // TODO code application logic here
        System.out.println("mst");
        graph.minSpanningTree();
        
        System.out.println("shortest path");
        graph.shortestPath(0, 4);
    }

}
