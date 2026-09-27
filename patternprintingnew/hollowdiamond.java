package patternprintingnew;
 import java.util.Scanner;
public class hollowdiamond {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int stars = n / 2 + 1;
        int spaces = 1;

        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= stars; j++) { 
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            // Change stars and spaces
            if (i <= n / 2) {
                stars--;
                spaces += 2;
            } else {
                stars++;
                spaces -= 2;
            }
        }
    }
