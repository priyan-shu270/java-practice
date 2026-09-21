package practice;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n%2==0){
            System.out.print("Even");
        }
        else{
            System.out.print("odd");
        }
    }
}
