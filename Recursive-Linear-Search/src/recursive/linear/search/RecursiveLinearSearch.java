package recursive.linear.search;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Christiaan Bouwer - VVF6HCS19
 */
public class RecursiveLinearSearch {

    static int[] List = {7, 9, 2, 4, 2, 3, 8, 7, 8};
    static int count = 0;
    static boolean found = false;

    /**
     * Main method, ask user input for target element Call linearSearch method
     * and display True or False, if found or not
     *
     * @param args
     */
    public static void main(String[] args) {
        int target = Integer.parseInt(JOptionPane.showInputDialog("Enter the number you want to search for"));
        found = linearSearch(List, target);

        if (found) {
            System.out.println(found + ", target(" + target + ") has been found!");
        } else {
            System.out.println(found + ", target(" + target + ") has NOT been found!");
        }

        int x = 100;
        for (int i = 0; i < x; i++) {
            while (x != 0) {
                x = x / 2;
            }
        }

    }

    /**
     * Recursively searches through the array for the target, every iteration
     * the array becomes smaller by removing the first element from it.
     *
     * @param arr - the array of elements that will be searched through
     * @param t - the target to search for in the array
     * @return true or false depending if the item is in the array or not
     */
    public static boolean linearSearch(int[] arr, int t) {
        count++;
        //test if array size, only one element or not
        if (arr.length != 1) {
            //smaller array created to store list without the first element
            int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
            if (arr[0] == t) {
                System.out.println("Target(" + t + ") found at element: " + count);
                found = true;
                return linearSearch(newArr, t);
            } else {
                return linearSearch(newArr, t);
            }
        } else {
            if (arr[0] == t) {
                System.out.println("Target(" + t + ") found at element: " + count);
                found = true;
                return found;
            } else {
                return found;
            }
        }
    }
}
