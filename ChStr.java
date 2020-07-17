package Task3;

import java.util.Scanner;

public class ChStr {

    public static void main(String[] args) {
        char ch = 'c';
        System.out.println("Enter the character");
        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        char c =str.charAt(0);
        char[] c_array=str.toCharArray();
        System.out.println("The string converted from character is: " + str);
    }
}