package patterenprinting;

import java.util.Scanner;

public class startriangleverticallyflipped {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
    }
}