package testingcode;

import java.util.Scanner;

public class FabSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Kindly enter no on which you want fab series:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		sc.close();
		int n0=0,n1=1,n2;
		
		System.out.print(n0+" "+n1);
		for(int i=2;i<number;i++)
		{
			n2=n0+n1;
			System.out.print(" "+n2);
			n0=n1;
			n1=n2;
			
				
		}
		
		
		
		
		
		
	}

}
