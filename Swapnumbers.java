package Task1;
import java.util.*;
public class Swapnumbers {
	 public static void main(String a[])   
	    {   
	        System.out.println("Enter the value of x and y between 1 and 106");  
	        Scanner sc = new Scanner(System.in);  
	        /*Define variables*/  
	        int x = sc.nextInt();
	        if((x<1));
	        int y = sc.nextInt();  
	        System.out.println("before swapping numbers: "+x +" "+ y);  
	       /*Swapping*/  
	        x = x + y;   
	        y = x - y;   
	        x = x - y;   
	        System.out.println("After swapping: "+x +"  " + y);   
	    }   
}
