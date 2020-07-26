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
public class MyListNode {
    private int data;
    private MyListNode next;

    public MyListNode() {
        data = 0;
        next = null;
    }
    
    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public MyListNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(MyListNode next) {
        this.next = next;
    }
    
    
}
