/*
 2.Write an user defined exception class which will take a number from 1 to 5 as an input
and prints the square of this number as the output.
 */


import java.util.*;

public class Excep2
{

   
    
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Please enter the number");
       int a=sc.nextInt();
         try
         {
             if(a>5||a<1)
             {
                 throw new Square();
             }
             System.out.println("SquARE is :"+a*a);
         }
         catch(Square e)
         {
             System.out.println(e);
         }
    }
    
}

class Square extends Exception
{
  public String toString()
  {
  return("Number out of range");
  }
    
}
