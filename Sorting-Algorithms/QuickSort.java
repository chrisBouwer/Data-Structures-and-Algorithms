package quicksort;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] a = {5, 4, 2, -12, 6, 300, 420, 8, 4};
        quickSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + ", ");
        }
    }

    public static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    public static void quickSort(int[] a, int left, int right) {
        if (left < right) {
            int pos = partition(a, left, right);
            quickSort(a, left, pos - 1);
            quickSort(a, pos, right);
        }
    }

    public static int partition(int[] a, int left, int right) {
        int l = left;
        int r = right;
        int middle = (left + right) / 2;
        int pivot = a[middle];
        while(l < r){
            //move left until find something out of place
            while(a[l] < pivot){
                l++;
            }
            while(a[r] > pivot){
                r--;
            }

            //swap a[l] and a[r] using a temp
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        return l;
    }
}
