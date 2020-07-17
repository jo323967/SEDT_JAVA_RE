package Task1;

public class Powercheck {
	 static boolean isPower(int x,  
             int y) 
{ 
int res1 = (int)Math.log(y) /  
     (int)Math.log(x); 
       
           
double res2 = Math.log(y) /  
        Math.log(x);  
return (res1 == res2); 
} 
public static void main(String args[])  
{ 
if(isPower(27, 729)) 
System.out.println("True"); 
else
System.out.println("False"); 
} 
} 

