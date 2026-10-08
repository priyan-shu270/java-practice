package array;

import java.util.Scanner;

public class printnegative {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        // Input
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Print negative values
        System.out.println("Negative values:");

        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}