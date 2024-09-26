//Problem 4: Given Q queries, check if the given number is present in the array or not.
//Note: Value of all the elements in the array is less than 105.

import java.util.Scanner;

public class FindQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int N = 100100;
// creating a frequency array as max(a[i]) < 105
        int[] freq = new int[N];
        for (int i = 0; i < n; i++) {
            freq[a[i]] = freq[a[i]] + 1;
        }
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int val;
            val = sc.nextInt();
            if (freq[val] > 0) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
