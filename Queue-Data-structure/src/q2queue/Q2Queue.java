package q2queue;

import javax.swing.JOptionPane;

/**
 *
 * @author Christiaan Bouwer - vvf6hcs19
 */
public class Q2Queue {

    static BeatySalonQueue queue = new BeatySalonQueue();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runSalon();
    }

    /**
     * Ask user input from menu Depending on user input appropriate methods are
     * called
     */
    private static void runSalon() {
        int size = 0;
        String ans = JOptionPane.showInputDialog(null, "Select an option:"
                + "\nA - Add someone to the queue"
                + "\nB - Remove the first person from the queue"
                + "\nC - See who is first in the queue"
                + "\nD - Number of people in the queue"
                + "\nE - View people in the queue in order"
                + "\nX - Exit");
        while (!ans.toUpperCase().equals('X')) {
            size++;
            switch (ans.toUpperCase().charAt(0)) {
                case 'A':
                    if (size <= 10) {
                        String name = JOptionPane.showInputDialog(null, "Enter your name");
                        String contNum = JOptionPane.showInputDialog(null, "Enter your contact number");
                        queue.enqueue(name + " " + contNum);
                    } else {
                        System.out.println("The queue is full for today!");
                    }
                    break;
                case 'B':
                    queue.dequeue();
                    break;
                case 'C':
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        System.out.println("The first person in the queue is: " + queue.peek());
                    }
                    break;
                case 'D':
                    System.out.println("The number of people currently in the queue is: " + queue.size());
                    break;
                case 'E':
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        System.out.println("Contents of the queue are: ");
                        for(int i = 0; i < queue.size(); i++){
                            System.out.println(queue.queue[i]);
                        }
                    }
                    break;
                case 'X':
                    System.exit(0);
                    break;
                default:
                    System.out.println("That is not an option!");
                    break;
            }
            ans = JOptionPane.showInputDialog(null, "Select an option:"
                    + "\nA - Add someone to the queue"
                    + "\nB - Remove the first person from the queue"
                    + "\nC - See who is first in the queue"
                    + "\nD - Number of people in the queue"
                    + "\nE - View people in the queue in order"
                    + "\nX - Exit");
        }
    }
}
