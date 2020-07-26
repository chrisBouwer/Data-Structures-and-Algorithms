package graph;

/**
 * The stack class
 * @author Christiaan Bouwer - VVF6HCS19
 */
public class Stack {
    
    private int[] items;
    private int top;
    private int size = 100;

    /**
     * stack constructor
     */
    public Stack() {
        items = new int[size];
        top = -1;
    }
    
    /**
     * adds the item to the stack
     * @param item 
     */
    public void push(int item){
        items[++top] = item;
    }
    
    /**
     * removes the top item of the stack
     * @return 
     */
    public int pop(){
        return items[top--];
    }
    
    /**
     * return the top item of the stack
     * @return 
     */
    public int peek(){
        return items[top];
    }
    
    /**
     * Test if the stack is empty or not
     * @return 
     */
    public boolean isEmpty(){
        return top == -1;
    }
}
