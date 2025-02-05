import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] bs = new int[n];
        System.out.println("Enter the sorted elements please : ");
        for (int i = 0; i < n; i++) {
            bs[i] = in.nextInt();
        }

        System.out.println("Enter the search key: ");
        int key = in.nextInt();

        int low = 0;
        int high = bs.length - 1;
        int mid = -1;

        while (low <= high) {
            mid = (low + high) / 2;
            if (bs[mid] == key) {
                System.out.println("Element found at index: " + mid + "  Value: " + bs[mid]);
                
                int left = mid - 1;
                while (left >=0 && bs[left] == key) {
                    System.out.println("Element found at index: " + left + "  Value: " + bs[left]);
                    left--;
                }

                int right = mid + 1;
                while (right < bs.length && bs[right] == key) {
                    System.out.println("Element found at index: " + right + "  Value: " + bs[right]);
                    right++;
                }

                break;
            }
            else if (bs[mid] < key) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        in.close();
    }
}
