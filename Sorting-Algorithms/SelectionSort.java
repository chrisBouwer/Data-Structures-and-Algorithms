package selectionsort;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
public class SelectionSort {

    
    public static void main(String[] args) {
    	int[] a = {1, 12, 5, 26, 7, 14, 5, 7, 2};
    	selectionSort(a);
    	for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + ", ");
        }                        
    }

    public static void selectionSort(int[] a) {
    	int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int posOfSmall = i;
            int smallest = a[posOfSmall];
            for (int j = i + 1; j < n; j++) {
                if (a[j] < smallest) {
                    posOfSmall = j;
                    smallest = a[posOfSmall];
                }
            }
            a[posOfSmall] = a[i];
            a[i] = smallest;
        }
    }
}
