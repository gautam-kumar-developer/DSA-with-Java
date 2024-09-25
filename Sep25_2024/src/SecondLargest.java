//Problem 4: Find the second-largest value in the given array.

import java.util.Scanner;

public class SecondLargest {
    public static int secondLargest(int[] a) {
        int n = a.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int k : a) {
            if (max < k) {
                max = k;
            }
        }
        for (int j : a) {
            if (j != max) {
                if (j > smax)
                    smax = j;
            }
        }
        return smax;
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
        System.out.println("Second Largest Number: " + secondLargest(arr));
    }
}
