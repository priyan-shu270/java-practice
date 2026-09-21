package practice;
import java.util.Scanner;

public class checknumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();
        if(a>0){
            System.out.print("Positive");
        }
        else if(a<0){
            System.out.print("negative");
        }
        if(a==0){
            System.out.print("0");
        }
    }
}
