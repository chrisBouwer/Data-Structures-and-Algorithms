package linkedlist;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
public class LinkedList {

    public static void main(String[] args) {
    	MyLinkedList myList = new MyLinkedList();
     	myList.append(2);
     	myList.append(3);
     	myList.append(4);
    	myList.append(5);
     	myList.display();
     	myList.delete(3);
     	myList.display();
     	myList.delete(2);
     	myList.display();
	myList.delete(5);
	myList.display();
    	System.out.println(myList.find(4));
    }
}