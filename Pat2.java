package DayAss;

import java.util.Scanner;

public class Pat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
		for(int i = 1; i <= n-1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" "+k+" ");
				k++;
			}
			System.out.print("\n");
		}

	}

}
