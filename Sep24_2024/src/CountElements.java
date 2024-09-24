//Example 3: Count the number of elements strictly greater than value x.

import java.util.Scanner;

public class CountElements {
    public static int countElements(int[] a, int x) {
        int count = 0;
        for (int j : a) {
            if (j > x)
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
        System.out.println("Number of Elements strictly greater than " + k + ": " + countElements(arr, k));
    }
}
