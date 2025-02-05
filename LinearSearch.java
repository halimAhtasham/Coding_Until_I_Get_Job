import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] ls = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            ls[i] = in.nextInt();
        }
        System.out.println("Enter the search key: ");
        int key = in.nextInt();

        for (int i = 0; i < ls.length; i++) {
            if (ls[i] == key) {
                System.out.println("Element found at index: " + i + "  Value: " + ls[i]);
            }
        }
    }
}
