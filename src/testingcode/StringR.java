package testingcode;

import java.util.Scanner;

public class StringR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str1="Hello how are you|";
	Scanner sc1=new Scanner(System.in);
	String str3=sc1.nextLine();
	sc1.close();
	
	StringBuffer sb=new StringBuffer(str1);
	//String str2=sb.reverse().toString();
	String str31=sb.reverse().toString();
	//System.out.println("Reverse String is:" +str2);
	System.out.println("Reverse String is:" +str31);
	
	}

}
