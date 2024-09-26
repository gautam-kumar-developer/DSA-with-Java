//Problem 2: Rotate the given array ‘a’ by k steps, where k is non-negative.
//Note: k can be greater than n as well.

import java.util.Scanner;

public class RotateBySteps {
    public static void rotate(int[] a, int k) {
        k %= a.length;
        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
    }

    private static void reverse(int[] a, int i, int j) {
        int tmp = 0;
        while (i < j) {
            tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
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
        System.out.print("Enter the Step: ");
        int k = sc.nextInt();
        rotate(arr, k);
        System.out.print("Rotated Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
