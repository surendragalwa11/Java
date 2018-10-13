/*
 4.Assume a scenario where we want to raise/throw an exception whenever a person tries to obtain a 
driving license by registering with an invalid-age or under-age

Generally, to obtain a driving license age should be 18 years old. And if someone tries to register for
driving license with age less than 18 then we should throw/raise an exception stating “To obtain a driving 
license age should be more than 18 years old”
 */


/*
 2.Write an user defined exception class which will take a number from 1 to 5 as an input
and prints the square of this number as the output.
 */


import java.util.*;

public class excep4
{

   
    
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Please enter your age");
       int a=sc.nextInt();
         try
         {
             if(a<18)
             {
                 throw new Licence();
             }
             System.out.println("You're eligible for licence");
         }
         catch(Licence e)
         {
             System.out.println(e);
         }
    }
    
}

class Licence extends Exception
{
  public String toString()
  {
  return("First grow up buddy :‑D To obtain a driving license age should be more than 18 years old");
  }
    
}

