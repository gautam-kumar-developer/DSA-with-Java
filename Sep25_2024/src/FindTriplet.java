//Problem 2: Count the number of triplets whose sum is equal to the given value x.

import java.util.Scanner;

public class FindTriplet {
    static int findTriplet(int[] a, int x) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == x) {
                        count++;
                    }
                }
            }
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
        System.out.println("Number of Triplet: " + findTriplet(arr, k));
    }
}