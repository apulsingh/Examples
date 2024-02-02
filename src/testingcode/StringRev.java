package testingcode;

import java.util.Scanner;

public class StringRev {

	public static String reverseString(String str) {
        // Convert the string to a StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        
        // Use the reverse() method to reverse the StringBuffer
        stringBuffer.reverse();
        
        // Convert the StringBuffer back to a string
        return stringBuffer.toString();
    }
	
	
	  public static void main(String[] args) {
	        String originalString = "Hello How are you";
	        
	        // Using StringBuffer to reverse the string
	        String reversedString = reverseString(originalString);
	        
	        System.out.println("Original String: " + originalString);
	        System.out.println("Reversed String: " + reversedString);

}
}
	  
	  