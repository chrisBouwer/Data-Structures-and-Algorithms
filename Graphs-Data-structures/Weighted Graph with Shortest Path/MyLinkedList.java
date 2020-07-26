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
public class MyLinkedList {

    private MyListNode list;

    public MyLinkedList() {
        list = null;
    }

    public boolean isEmpty() {
        return list == null;
    }

    public void append(int value) {
        MyListNode temp = new MyListNode();
        temp.setData(value);
        temp.setNext(null);
        if (list == null) {
            list = temp;
        } else { // find the last node in the list
            MyListNode p = list;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(temp);
        }
    }
    
    public int getUWithMinDist(int[] dist) {
        MyListNode p = list;
        int pos = p.getData();
        int smallest = dist[pos];
        while (p.getNext() != null) {
            if (dist[p.getData()] < smallest) {
                pos = p.getData();
                smallest = dist[pos];
            }
            p = p.getNext();
        }
        return pos;
    }

    public void delete(int value) {
        MyListNode p = list;
        MyListNode r = null;
        if (p.getData() == value && p.getNext() == null) {
            list = null;
        } else if (p == list && p.getData() == value && p.getNext() != null) {
            list = p.getNext();
        } else {
            while (p.getData() != value) {
                r = p;
                p = p.getNext();
            }
            r.setNext(p.getNext());
        }

    }

    public void display() {
        System.out.println("");
        MyListNode p = list;
        while (p != null) {
            System.out.print(p.getData() + ", ");
            p = p.getNext();
        }
    }
}
