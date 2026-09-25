package loop;

import java.util.Scanner;

public class maxof2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
          int b = scn.nextInt();
    
        if(a>b){
            System.out.println(a);
        }
        if(b>a){
            System.out.println(b);
        }
            if(a==b){
                System.out.println(a);
            }
    }  
}
