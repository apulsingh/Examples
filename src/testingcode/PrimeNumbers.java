package testingcode;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Kindly enter no on which you want fab series:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		sc.close();
		
		String primeno=" ";
		int i, j;
		
		for(i=2;i<=number;i++)
		{
			int count=0;
			for(j=i; j>=1;j--)
			{
				if(i%j==0)
				{
					count=count+1;
					
				}
				
			}
			if(count==2)
			{
				primeno=primeno+i+" ";
						
			}	
			
			
			
		}
	
		System.out.print(primeno);	
	
	}

}
