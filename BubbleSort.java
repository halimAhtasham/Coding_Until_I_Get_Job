import java.util.Scanner;

public class BubbleSort {
    public int[] arr;

    // constructor
    public BubbleSort(int n){
        arr = new int[n];
    }
    public int[] AscendingBubbleSort(){
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] DescendingBubbleSort(){
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public void display(){
        for (int i : arr) {
            System.out.print(i+ "");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int k = in.nextInt();
        BubbleSort bs = new BubbleSort(k);
        System.out.println("Enter the elements: ");
        for (int i = 0; i < k; i++) {
            bs.arr[i] = in.nextInt();
        }
        bs.DescendingBubbleSort();
        bs.display();
        // bubbleSortA(arr);
        // for (int i : arr) {
        //     System.out.print(" "+ i);
        // }
        // bubbleSortD(arr);
        // for (int i : arr) {
        //     System.out.print(" "+ i);
        // }
        in.close();
    }

    // //Ascending order
    // private static void bubbleSortA(int array[]){
    //     int n = array.length;
    //     for (int i = 0; i < n-1; i++) {
    //         for (int j = 0; j < n - i - 1; j++) {
    //             if (array[j] > array[j+1]) {
    //                 int temp = array[j];
    //                 array[j] = array[j+1];
    //                 array[j+1] = temp;
    //             }
    //         }
    //     }
    // }
    // // Descending order
    // private static void bubbleSortD(int array[]){
    //     for (int i = 0; i < array.length -1; i++) {
    //         for (int j = 0; j < array.length - i - 1; j++) {
    //             if (array[j] < array[j+1]) {
    //                 int temp = array[j];
    //                 array[j] = array[j+1];
    //                 array[j+1] = temp;
    //             }
    //         }
    //     }
    // }
}