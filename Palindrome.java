
import java.util.*;


public class Palindrome
{

   
    public static void main(String[] args)
    {
        String str;
        String reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any word ");
        str=sc.nextLine();
        
         for(int i=str.length()-1;i>=0;i--)
         {
             reverse=reverse+str.charAt(i);
         }
         
         if(str.equals(reverse))
             System.out.println("Palindrome");
         else
             System.out.println(" not Palindrome");  
         
             
    }
    
}
