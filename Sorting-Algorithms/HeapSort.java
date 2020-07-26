package heapsort;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] a = {1, 12, 5, 26, 7, 14, 3, 7, 2};

        heapSort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(" " + a[i] + ", ");
        }
    }

    public static void heapSort(int[] a) {
        heapify(a);
        heapSort(a, a.length);
    }

    public static void heapify(int[] a) {
        int n = a.length;
        for (int i = n/2 - 1; i >= 0; i--) {
            sift(a, i, n);
        }
    }

    public static void heapSort(int[] a, int n) {

        while (n > 1) {
            int temp = a[0];
            a[0] = a[n - 1];
            a[n - 1] = temp;
        }
        n--;
        sift(a, 0, n);
    }

    public static void sift(int[] a, int parent, int n) {
        int child = 2*parent + 1;
        while (child < n) {
            if (child + 1 < n) {
                if (a[child + 1] > a[child]) {
                    child = child + 1;
                }
            }

            if (a[parent] < a[child]) {
                int temp = a[parent];
                a[parent] = a[child];
                a[child] = temp;
            } else {
                return;
            }
            
            parent = child;
            child = 2*parent + 1;
        }
    }
}
