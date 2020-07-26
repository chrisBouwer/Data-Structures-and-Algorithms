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
public class Edge implements Comparable {
    private int u;  // start
    private int v;  // end 
    private int weight;

    @Override
    public int compareTo(Object other) {
        Edge otherObject = (Edge)other;
        if (this.weight < otherObject.weight)
            return -1;
        else if (this.weight > otherObject.weight)
            return 1;
        return 0;
    }
    
    /**
     * @return the u
     */
    public int getU() {
        return u;
    }

    /**
     * @param u the u to set
     */
    public void setU(int u) {
        this.u = u;
    }

    /**
     * @return the v
     */
    public int getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(int v) {
        this.v = v;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}
