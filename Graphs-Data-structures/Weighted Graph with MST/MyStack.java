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
public class MyStack {
    private int[] data;
    private int top;
    
    public MyStack(int n) {
        data = new int[n];
        top = -1;
    }
    
    public void push(int value) {
        data[++top] = value;
    }
    
    public int peek() {
        return data[top];
    }
    
    public int pop() {
        int val = data[top--];
        return val;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == data.length - 1;
    }
}
