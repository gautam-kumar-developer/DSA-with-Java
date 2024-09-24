//Example 1: Find the last occurrence of an element x in a given array.
import java.util.Scanner;

public class LastOccurrence {
    public static int lastOccurrence(int[] a, int x) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                index = i;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n]; //array creation
        System.out.print("Enter elements of array: "); //array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number: ");
        int k = sc.nextInt();
        System.out.println("Last Occurrence: " + lastOccurrence(arr, k));
    }
}
