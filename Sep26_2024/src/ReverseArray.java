//Problem 1: Reverse the given array ‘a’ consisting of integer values.

import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] a, int n) {
        int tmp = 0;
        int i = 0, j = n - 1;
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
        reverse(arr, n);
        System.out.print("Reversed Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
