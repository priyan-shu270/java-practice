package array;
public class maxofarray2 { 
    public static void main(String[] args) {
       
        int [] arr = {23,34,-98,56,37};
        
        int max = arr[0];
        for(int i=0; i<5 ; i++){
           if(arr[i]>max) max = arr[i];
        }
        System.out.println(max);
        }
    }