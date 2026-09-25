package loop;
import java.util.Scanner;
public class drivinglicence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         if(n>=18){
            System.out.println("Elegible for driving");
         }else
            System.out.println("not elegible for dirving");
    }
}
