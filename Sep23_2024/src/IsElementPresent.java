/*Problem 3: Search if the given element x is present in the array or not and find the index. If not present then
return the index as -1. (Linear Search)*/

import java.util.Scanner;

public class IsElementPresent {
    static int findElement(int[] arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        return index;
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
        System.out.println("Enter Element to find in array: ");
        int k = sc.nextInt();
        int ans = findElement(arr, k);
        if (ans == -1) {
            System.out.println("Element Is Not Present!!");
        } else {
            System.out.println("Element Is Present at index: " + ans);
        }
    }
}
