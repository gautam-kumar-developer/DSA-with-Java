//Write a program to display Multiplication of two matrices entered by the user.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows=");
        m = sc.nextInt();
        System.out.println("enter the number of columns=");
        n = sc.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] ans = new int[m][n];
        int i, j, k;
        System.out.println("enter the first matrix element=\n");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the Second matrix element=\n");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("multiply of the matrix=\n");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                ans[i][j] = 0;
                for (k = 0; k < n; k++) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}