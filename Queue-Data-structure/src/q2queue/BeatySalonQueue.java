package q2queue;

/**
 * @author Christiaan Bouwer - vvf6hcs19
 */
class BeatySalonQueue {

    public String[] queue; // queue for storing data
    private int n;          // number of elements in the queue
    private int first;      // position of the first element in queue
    private int last;       // position of last element in queue

    /**
     * Constructor to set all defaults
     */
    public BeatySalonQueue() {
        queue = new String[10];
        n = 0;
        first = 0;
        last = 0;
    }

    /**
     * Check if queue is empty or not
     *
     * @return true if empty, false if not
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * Add element to the back of the queue
     * 
     * @param item - person's details to be added to queue
     */
    public void enqueue(String item) {
        queue[last] = item;
        last++;
        n++;
    }

    /**
     * Remove the first item from the queue if the queue is not empty
     *
     * @return first item in queue
     */
    public String dequeue() {
        String item = null;
        if (!isEmpty()) {
            item = queue[first];
            first++;
            n--;
            System.out.println(item + " has been removed from the queue");
        } else {
            System.out.println("The queue is already empty!");
        }
        return item;
    }

    /**
     * @return number of elements in queue
     */
    public int size() {
        return n;
    }

    /**
     * @return the first item in the queue
     */
    public String peek() {
        return queue[first];
    }
}
