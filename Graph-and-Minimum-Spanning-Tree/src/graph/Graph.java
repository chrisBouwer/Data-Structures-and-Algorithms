package graph;

/**
 *
 * @author Christiaan Bouwer - VVF6HCS19
 */
public class Graph {

    public Vertex[] verList;
    public int[][] adj;
    public int numVer;
    public Stack stack;
    public int n = 100;
    
    /**
     * Graph constructor
     */
    public Graph(){
        numVer = 0;
        verList = new Vertex[n];
        adj = new int[n][n];
        stack = new Stack();
        
        for (int[] adj1 : adj) {
            for (int j = 0; j < adj.length; j++) {
                adj1[j] = 0;
            }
        }        
    }
    
    /**
     * adds the labels to the vertex
     * @param label 
     */
    public void addVertex(char label) {
        verList[numVer++] = new Vertex(label);
    }
    
    /**
     * prints the vertex
     * @param ver 
     */
    public void displayVertex(int ver) {
        System.out.print(verList[ver].label);
    }
    
    /**
     * Add the edge
     * @param start
     * @param dest 
     */
    public void addEdge(int start, int dest) {
        adj[start][dest] = 1;
        adj[dest][start] = 1;
    }
    
    /**
     * gets the adjacent unvisited vertex
     * @param ver
     * @return the vertex index
     */
    public int getAdjUnvisitedVertex(int ver) {
        for (int i = 0; i < numVer; i++) {
            if (adj[ver][i] == 1 && !verList[i].visited) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * depth first search on the graph
     */
    public void dfs(){
        verList[0].visited = true;
        stack.push(0);
        
        while(!stack.isEmpty()){
            int x = stack.peek();
            int y = getAdjUnvisitedVertex(x);
            if(y == -1){
               stack.pop();
            } else{
                verList[y].visited = true;
                stack.push(y);
                displayVertex(x);
                displayVertex(y);
                System.out.println(" ");
            }
        }
        for (int j = 0; j < numVer; j++)
        {
            verList[j].visited = false;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 2);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);
        graph.addEdge(4, 3);
        graph.addEdge(4, 6);
        graph.addEdge(5, 5);
        graph.addEdge(6, 5);
        System.out.print("Minimum spanning tree:");
        graph.dfs();
        System.out.println();

    }
    
}
