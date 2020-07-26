package linkedlist;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
class MyListNode {
   private int data;
   private MyListNode next;

   public int getData(){
      return data;
   }
  
   public void setData(int value){
      this.data = value;      
   }
  
   public MyListNode getNext(){
      return next;      
   }
  
   public void setNext(MyListNode next){
      this.next = next;
   }  
}
