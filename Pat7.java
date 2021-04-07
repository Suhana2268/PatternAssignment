package DayAss;

import java.util.Scanner;

public class Pat7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++){
		    for(int j=n; j>i; j--){
		       System.out.print(" ");
		    }
		    System.out.print("*");
		    for(int j=1; j<(i-1)*2; j++){
		       System.out.print(" ");
		    }
		    if(i==1){
		      System.out.print("\n");
		    }
		    else{
		      System.out.print("*\n");
		    }
		}
		for(int i=n-1; i>=1; i--){
		    for(int j=n; j>i; j--){
		       System.out.print(" ");
		    }
		    System.out.print("*");
		    for(int j=1; j<(i-1)*2; j++){
		       System.out.print(" ");
		    }
		    if(i==1){
		      System.out.print("\n");
		    }
		    else{
		      System.out.print("*\n");
		    }
		}

	}

}
