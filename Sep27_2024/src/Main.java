//Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
//greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
//integer)

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n]; //array creation
        System.out.print("Enter elements of array: "); //array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0;
        int count = 0;
        while (i < n) {
            count++;
            while (i < n - 1 && arr[i + 1] == arr[i]) {
                i++;
            }
            i++;
        }
        System.out.print(count >= m);
    }
}
