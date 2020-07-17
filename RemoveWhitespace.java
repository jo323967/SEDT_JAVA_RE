package Task3;

import java.util.Scanner;

public class RemoveWhitespace {
	
	    public static void main(String[] args) {    
	        System.out.println("Enter the string");
	        Scanner sc = new Scanner(System.in); 
	        String str = sc.nextLine();  
	        String noSpaceStr = str.replaceAll("\\s", "");
	        System.out.println(noSpaceStr);  
}
}