package array;
 import java.util.Scanner;
public class maxofarray { 
    public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i=0; i<=n-1; i++){
            arr[i]= scn.nextInt();
        }
           int ans = maxfunction(arr); 
        System.out.print(ans);
        }
        public static int maxfunction(int[]arr){
            int max = Integer.MIN_VALUE;
            for(int i =0; i<arr.length; i++){
             if(arr[i]>max){
                 max = arr[i];
             }
            }
            return max;
        }
    }
