//Problem 1: Sort an Array consisting of only 0s and 1s.

import java.util.Scanner;

public class SortZeroesAndOne {
    public static void sortZeroesAndOne(int[] a) {
        int n = a.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (a[i] == 1 && a[j] == 0) {
                a[i] = 0;
                a[j] = 1;
                i++;
                j--;
            }
            if (a[i] == 0) i++;
            if (a[j] == 1) j--;
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
        sortZeroesAndOne(arr);
        System.out.println("Array after sorting: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
