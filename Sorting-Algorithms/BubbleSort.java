package bubblesort;

/**
 *
 * @author VVF6HCS19 - Christiaan Bouwer
 */
public class BubbleSort {

    public static void bubbleSort(int a[]){
        for (int j = 0; j < a.length - 1; j++) {
          //boolean swapped if equals false;
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                   //swapped if it equals true;
                }
            }
        }
    }

    public static void main(String[] args) {
     int a[] = {44, 55, 12, 42, 94, 103, 67, 6};
     bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    } 
}
