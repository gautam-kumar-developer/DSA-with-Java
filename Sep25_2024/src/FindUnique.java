//Problem 3: Find the unique number in a given array where all the elements are repeated twice with one value being unique.

import java.util.Scanner;

public class FindUnique {
    public static int findUnique(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    a[i] = a[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++)
            if (a[i] > 0)
                return a[i];
        return 1;
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
        System.out.println("Unique Number: " + findUnique(arr));
    }
}

