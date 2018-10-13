/*
  Write a java code which accepts Employee Name.The Employee name should start with capital letter.
If the users enters the name with first letter lowercase,the code has to through an excetion with message 
"Invalid String Format,Please enter the name with first letter capital".
 */



import java.util.*;

public class Excep3
{

   
    
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Please enter name");
       String s=sc.nextLine();
         try
         {
             if(!Character.isUpperCase(s.charAt(0)))
             {
                 throw new Name();
             }
             System.out.println("Correct  :"+s);
         }
         catch(Name e)
         {
             System.out.println(e);
         }
    }
    
}

class Name extends Exception
{
  public String toString()
  {
  return("Invalid String Format,Please enter the name with first letter capital");
  }
    
}

