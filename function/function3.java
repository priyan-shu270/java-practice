package function;

import java.util.Scanner;

public class function3 {
    public static int calculateProduct(int a , int b) {
        return a*b;
    }
    public static void main(String args []) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
       int product = calculateProduct(a, b);
       System.out.println("product of 2 number is : " + product);
    }

}