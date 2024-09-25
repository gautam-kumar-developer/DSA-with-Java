//Problem 5: Given an array ‘a’ consisting of integers. Return the first value that is repeating in this array.
// If no value is being repeated, return -1.

import java.util.Scanner;

public class FirstRepeat {
    public static int firstRepeated(int[] a, int n) {
        for(int i = 0; i < n; i++){
            int curr = a[i];
            for(int j = i+1; j < n; j++) {
                if(a[j] == curr) return a[i];
            }
        }
        return -1;
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
        int ans = firstRepeated(arr, n);
        System.out.println("First Repeating Number: "+ ans);
    }
}
