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
public class DisjointSetCluster {
    private int[] parents;
    
    public DisjointSetCluster(int capacity) {
        parents = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            makeSet(i);
        }
    }
    
    public void makeSet(int i) {
        parents[i] = -1;
    }
    
    public boolean isRoot(int i) {
        return parents[i] == -1;
    }
    
    // return the representative of the set
    public int find(int i) {
        while (!isRoot(i)) {
            i = parents[i];
        }
        return i;
    }
    
    // do values have the same representative
    public boolean inSameSet(int i, int j) {
        return find(i) == find(j);
    }
    
    // not a very clever union but ok for this implementation
    public void union(int i, int j) {
        parents[find(i)] = find(j);
    }
    
    // override the toString() method
    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < parents.length; i++)
            str = str + parents[i] + " ";
        return str;
    }
}
