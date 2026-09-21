package practice;
import java.util.Scanner;
public class vowelorconsonant {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        char ch = scn.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
