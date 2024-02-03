package testingcode;

import java.util.Scanner;

public class PyramidPring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Kindly Enter size of pyramid:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		sc.close();
		System.out.println("Size of pyramid is:" +size);
		
		int i,j;
		for (i=1; i<=size;i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print("*  ");
				
			}
			System.out.println();
			
			
		}
		
		
	}

}
