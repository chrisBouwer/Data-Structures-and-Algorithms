/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbvweightedgraph;

import java.util.Arrays;

/**
 *
 * @author Christiaan Bouwer
 */
public class EdgeArray {
    private Edge[] edge;
    
    public EdgeArray(int size) {
        edge = new Edge[size];
    }
    
    public Edge[] getEdge() {
        return edge;
    }
    
    public void sort() {
        Arrays.sort(edge);
    }
    
    public void setEdge(Edge[] edge) {
        this.edge = edge;
    }
    
}
