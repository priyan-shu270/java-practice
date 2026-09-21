package practice;
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
          if(n%4==0){
            System.out.print("Leap year");
          }
          else{
            System.out.println("not a leap year");
          }
    }
}
