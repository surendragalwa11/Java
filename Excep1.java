/*
 Write a program which allows you to purchase the headphones.The quantity should be accepted from the user.
If the custmor enters the headphone quantity greater than 10,it should throw an exception that headphones 
are out of stock.

 */
import java.util.*;

public class Excep1
{

   
    
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Please enter the quantity of the heaphones");
       int a=sc.nextInt();
         try
         {
             if(a>10||a<1)
             {
                 throw new Headphone();
             }
             System.out.println("Thanks for trusting us.Your order wil be delivered in 2 days.");
         }
         catch(Headphone e)
         {
             System.out.println(e);
         }
    }
    
}

class Headphone extends Exception
{
  public String toString()
  {
  return("This quantity is not available.Please decrease it.");
  }
}