package Task1;
import java.util.*;
public class Strreverse {

  public static void main(String args[])
  {
    String original, reverse = "";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string to reverse");
    original = in.nextLine();

    int length = original.length();
    System.out.println("Length of the string: " + length);
    for (int i = length-1 ; i >= 0 ; i--)
      reverse = reverse + original.charAt(i);

    System.out.println("Reverse of the string: " + reverse);
  }
}


