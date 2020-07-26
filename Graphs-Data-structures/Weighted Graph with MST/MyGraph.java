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
public class MyGraph {

    private int[][] adj;
    private Vertex[] vertexList;

    public MyGraph(int n) {
        // initialise the adjacency matrix
        adj = new int[n][n];
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[i].length; j++) {
                adj[i][j] = 0;
            }
        }
        
        vertexList = new Vertex[n];
        for (int k = 0; k < vertexList.length; k++) {
            vertexList[k] = new Vertex();
            vertexList[k].setLabel(k);
            vertexList[k].setVisited(false);
        }
    }

    public void addEdge(int i, int j, int weight) {
        adj[i][j] = weight;
        adj[j][i] = weight;
    }
    
    public int getAdjUnvisitedVertex(int u) {
        for (int i = 0; i < adj[u].length; i++) {
            if (adj[u][i] > 0 && !vertexList[i].isVisited()) {
                return i;
            }
        }
        return -1;
    }
    
    public void displayVertex(int i) {
        System.out.print(vertexList[i].getLabel() + " ");
    }
    
    public void dfs() {
        for (int k = 0; k < vertexList.length; k++) {
            vertexList[k] = new Vertex();
            vertexList[k].setLabel(k);
            vertexList[k].setVisited(false);
        }
        MyStack aStack = new MyStack(adj.length);
        // begin at vertex 0
        vertexList[0].setVisited(true);
        aStack.push(0);
        while (!aStack.isEmpty()) {
            int u = aStack.peek();
            int v = getAdjUnvisitedVertex(u);
            if (v == -1) {  // nothing found
                int garbage = aStack.pop();
            } else { // something found
                vertexList[v].setVisited(true);
                aStack.push(v);
                displayVertex(u);
                displayVertex(v);
                System.out.println();
            }
        }
    }
    
    public void bfs() {
        // set up initial conditions
        for (int k = 0; k < vertexList.length; k++) {
            vertexList[k] = new Vertex();
            vertexList[k].setLabel(k);
            vertexList[k].setVisited(false);
        }
        MyQueue q = new MyQueue(adj.length);
        q.enqueue(0);
        while (!q.isEmpty()) {
            int u = q.dequeue();
            vertexList[u].setVisited(true);
            for (int v = 0; v < adj.length; v++) {
                if (adj[u][v] > 0 && !vertexList[v].isVisited()) {
                    displayVertex(u);
                    displayVertex(v);                    
                    System.out.println();
                    q.enqueue(v);
                }
            }
        }
    }

    @Override
    public String toString() {
        String buffer = "";
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[i].length; j++) {
                buffer = buffer + adj[i][j] + ", ";
            }
            buffer = buffer + "\n";
        }
        return buffer;
    }
    
    // implement Kruskal's algorithm 
    public void minSpanningTree() {
        DisjointSetCluster ds = new DisjointSetCluster(adj.length);
        for (int v = 0; v < vertexList.length; v++) {
            ds.makeSet(v);
        }
        
        // setup the edge array by extracting edges from 
        // the adjacency matrix
        EdgeArray ea = new EdgeArray(adj.length*adj.length);
        for (int i = 0; i < ea.getEdge().length; i++) {
            ea.getEdge()[i] = new Edge();
        }
        // copy edges from the adjacency matrix
        int count = 0;
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[i].length; j++) {
                if (adj[i][j] > 0 && adj[j][i] > 0) {
                    ea.getEdge()[count].setU(i);
                    ea.getEdge()[count].setV(j);
                    ea.getEdge()[count].setWeight(adj[i][j]);
                    count++;
                }
            }
        }
        
        // Kruskal
        ea.sort(); // sort edges into ascending order
        for (int i = 0; i < ea.getEdge().length; i++) {
            Edge e = ea.getEdge()[i];
            int u = e.getU();
            int v = e.getV();
            int w = e.getWeight();
            if (ds.find(u) != ds.find(v)) {
                displayVertex(u);
                displayVertex(v);
                System.out.println(" " + w);
                ds.union(u, v);
            }
        }
        
        
    }

}
