package DayAss;

import java.util.Scanner;

public class Pat5 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
        
        for (int i=1; i<= n ; i++)
        {
        	
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }   
            for (int l = 1; l <= (2*i -1); l++) {
                if( l==1 || i == n || l==(2*i -1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
       
		
	}
}


