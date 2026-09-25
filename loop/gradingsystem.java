package loop;
import java.util.Scanner;

public class gradingsystem {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int marks = scn.nextInt();
        if(marks>=90){
            System.out.println("Excellent");
        }
        else if(marks>80 && marks<90){
            System.out.println("good 1");
        }
         else if(marks>70 && marks<=80){
            System.out.println("good 2");
        }
        else if(marks>60 && marks<=70){
            System.out.println("good 3");
        }
        else if(marks>50 && marks<=60){
            System.out.println("good 4");
        }
        else if(marks>40 && marks<=50){
            System.out.println("good 5");
        }
    }
}
