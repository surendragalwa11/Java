
import java.util.*;

// Java program to demonstrate working of split() 
public class Ass20 { 
	public static void main(String args[]) 
	{ 
        int i = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        
             for (String a : arr) 
              System.out.print(a+" hello "); 
	} 
} 



