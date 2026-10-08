package practice;
import java.util.Scanner;
public class yes {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for(int i=1; i<=T; i++){
		    	int X = scn.nextInt();
		    		int Y = scn.nextInt();
		    		if (X>=Y){
		    		    System.out.println("YES");
		    		    }
		    		    else{
		    		        System.out.println("no");
		    		} 
		}

	}

}


