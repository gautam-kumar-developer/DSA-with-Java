//Problem 2: Given an array of integers ‘a’, move all the even integers at the beginning of the array followed by
//all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies
//the condition.

import java.util.Scanner;

public class Target {
    public static int[] sortArrayByParity(int[] a) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (a[i] % 2 == 1 && a[j] % 2 == 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            if (a[i] % 2 == 0) i++;
            if (a[j] % 2 == 1) j--;
        }
        return a;
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
        int[] ans = sortArrayByParity(arr);
        System.out.println("Array after sorting: ");
        for (int element : ans) {
            System.out.print(element + " ");
        }
    }
}
