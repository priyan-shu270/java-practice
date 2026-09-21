package practice;
import java.util.Scanner;
public class elegibleforvote {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
           if(n>=18){
            System.out.print("Eligible for vote");
           }
           else{
            System.out.print("Not Eligible for vote");
           }
    }
}
