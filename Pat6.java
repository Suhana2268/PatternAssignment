package DayAss;

import java.util.Scanner;

public class Pat6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		 
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n-i;j++)
		 
		{
		System.out.print(" ");
		}
		 
		for(int j=1;j<=i*2-1;j++)
		 
		{
		System.out.print("*");
		}
		System.out.println();
		 
		} 
		for(int i=n-1;i>0;i--)
		{
		for(int j=1;j<=n-i;j++)
		 
		{
		System.out.print(" ");
		}
		for(int j=1;j<=i*2-1;j++)
		 
		{
		System.out.print("*");
		}
		System.out.println();
		}
	}

}
