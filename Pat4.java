package DayAss;

import java.util.Scanner;

public class Pat4 {
	 public static void main(String args[])
	    {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int even = 2;
		 int odd = 1;
		 for(int i = 1; i <= n; i++) {
			 if(i % 2 !=0) {
				 for(int j = 1; j <= i; j++) {
					 System.out.print(odd+" ");
					 odd = odd+2;
				 }
			 }
			 else {
					 for(int j = 1; j <= i; j++) {
						 System.out.print(even+" ");
						 even = even+2;
					 }
			 }
			 System.out.println();
			 }
	    }

}
