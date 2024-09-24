//Example 4: Check if the given array is sorted or not.

import java.util.Scanner;

public class SortedOrNot {
    public static boolean check(int a[]) {
        boolean ans = true;
        for(int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                ans = false;
                break;
            }
        }
        return ans;
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
        System.out.println("Sorted Status: " + check(arr));
    }
}
