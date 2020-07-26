package searching;

import java.util.Arrays;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {5, 3, 4, 1, 2};
        int target = 1;
        int position = linearSearch(a, target);
        System.out.println("Found " + target + " at " + position);

        Arrays.sort(a);

        position = binarySearch(a, target);
        System.out.println("Found " + target + " at " + position);
    }

    public static int linearSearch(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -999;
    }

    public static int binarySearch(int[] a, int target) {
        return binarySearch(a, 0, a.length - 1, target);
    }
    
    public static int binarySearch(int[] a, int left, int right, int target){
        int middle = (left + right) / 2;
        if (a[middle] == target){
            return middle;
        } else if (target < a[middle]) {
           return binarySearch(a, left, middle - 1, target);
        } else if (a[middle] < target){
            return binarySearch(a, middle + 1, right, target);
        } 
        return -999;
    }
}
