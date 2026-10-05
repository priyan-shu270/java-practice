package array;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        //input
        for(int i =0; i<=n-1; i++){
           arr[i]= scn.nextInt();
            System.out.println(arr[i]);
        } 
}
}
