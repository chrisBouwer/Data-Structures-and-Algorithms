package linkedlist;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
class MyLinkedList {

    private MyListNode list;

    public MyLinkedList() {
        list = null;
    }

    public void append(int value) {
        if (list == null) {
            list = new MyListNode();
            list.setData(value);
            list.setNext(null);
        } else {
            MyListNode p = list;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            MyListNode temp = new MyListNode();
            temp.setData(value);
            temp.setNext(null);
            p.setNext(temp);
        }
    }

    public void display() {
        System.out.println(" ");
        MyListNode p = list;
        while (p != null) {
            System.out.print(p.getData() + ", ");
            p = p.getNext();
        }
    }

    public void delete(int value) {
        MyListNode p = list;
        MyListNode r = null;
        while (p != null && p.getData() != value) {
            r = p;
            p = p.getNext();
        }
        if (p == list) {
            list = list.getNext();
        } else if (p.getData() == value) {
            r.setNext(p.getNext());
        }
    }
}
