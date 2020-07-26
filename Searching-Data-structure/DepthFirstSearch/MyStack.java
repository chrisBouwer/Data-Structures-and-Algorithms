package depthfirstsearch;

/**
 *
 * @author VVF6HCS19 - Chris Bouwer
 */
class MyStack {

	private int[] data;
	private int top;

	public MyStack(){
	    data = new int[4];
	    top = -1;
	}

	public void push(int value){
	    data[++top] = value;    
	}

	public boolean isEmpty(){
 	   return top == -1;
	}

	public int peek(){
	    return data[top];
	}

	public int pop(){
  		return  data[top--]; 
	}
}
