import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int k = in.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = in.nextInt();
        }
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        // displayArray(arr);
        in.close();
    }
    public static void selectionSort(int[] arr){
        int l = arr.length;
        for (int i = 0; i < l-1; i++) {
            int min = i;
            for (int j = i+1; j < l; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
