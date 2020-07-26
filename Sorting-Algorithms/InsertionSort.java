package insertionsort;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
public class InsertionSort {

    public static void main(String[] args) {
    	int[] a = {1, 12, 5, 26, 7, 14, 3, 7, 2};
    	insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + ", ");
        }                        
    }

    public static void insertionSort(int[] a) {
    	int n = a.length;
        for (int i = 1; i < n; i++) {
    		int valueToInsert = a[i];
        	//search backwards through the sorted sequence for the correct position of val
        	int j = i - 1;
            	while (j >= 0 && a[j] > valueToInsert) {
                	a[j + 1] = a[j];
                	j--;
            	}
            	a[j + 1] = valueToInsert;
        }
    }
}
