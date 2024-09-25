//Problem 1: Find the total number of pairs in the array whose sum is equal to the given value x.

import java.util.Scanner;

public class PairSum {
    public static int pairSum(int[] a, int x) {
        int count = 0;
        int n = a.length;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (a[i] + a[j] == x)
                    count++;
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
        System.out.println("Number of Pairs: " + pairSum(arr, k));
    }
}
