//Problem 1: Calculate the sum of all the elements in the given array.
import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int sum = 0;
        int n = sc.nextInt();
        int[] arr = new int[n]; //array creation
        System.out.print("Enter elements of array: "); //array input
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // calculating sum
        for (int i = 0; i<n; i++){
            sum += arr[i];
        }
        System.out.print("Sum of Elements of Array: "+sum);
    }
}