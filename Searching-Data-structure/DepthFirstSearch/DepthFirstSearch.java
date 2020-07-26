package depthfirstsearch;

/**
 *
 * @author VVF6HCS19 - Chris Bouwer
 */
public class DepthFirstSearch {

    public static void main(String[] args) {

        MyGraph graph = new MyGraph();

     	graph.addEdge(0, 1, 25);
     	graph.addEdge(2, 0, 89);
     	graph.addEdge(1, 2, 5);
     	graph.addEdge(3, 1, 7);

        System.out.println(graph.toString());

        graph.dfs();
    }
}
