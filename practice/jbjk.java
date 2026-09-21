package practice;

public class jbjk {

    public static void main(String[] args) {

        int n = 9;

        int nst = 1;
        int nsp = n / 2;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }

            // next row
            System.out.println();

            // update spaces and stars
            if (i <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
        }
    }
}