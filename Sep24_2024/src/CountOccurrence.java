//Example 2: Count the number of occurrences of a particular element x.
import java.util.Scanner;

public class CountOccurrence {
    public static int countOccurrence(int[] a, int x) {
        int count = 0;
        for (int j : a) {
            if (j == x)
                count++;
        }
        return count;
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
        System.out.println("Number of Occurrence: " + countOccurrence(arr, k));
    }
}
