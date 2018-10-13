/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


class TryCatchBlock  
{
   
    public static void  method() throws ArithmeticException
    {
         System.out.println("using the throws keyword before");
        int k=10/0;
        System.out.println("using the throws keyword after");
    }
            
    public static void main(String args[])
   {
       
      int num1, num2;
      try 
      {
          
          method();
         /* We suspect that this block of statement can throw 
          * exception so we handled it by placing these statements
          * inside try and handled the exception in catch block
          */
         num1 = 0;
         num2 = 62 / num1;
         System.out.println(num2);
         System.out.println("Hey I'm at the end of try block");
      }
      catch (ArithmeticException e)
      { 
         /* This block will only execute if any Arithmetic exception 
          * occurs in try block
          */
         System.out.println("You should not divide a number by zero");
          System.out.println(e.getMessage());
      }
      catch (Exception e)
      {
         /* This is a generic Exception handler which means it can handle
          * all the exceptions. This will execute if the exception is not
          * handled by previous catch blocks.
          */
         System.out.println("Exception occurred");
         
          e.printStackTrace();
      }
      finally
      {
      System.out.println("I'm in finally block in Java.");

      }
      System.out.println("I'm out of try-catch block in Java.");
      
      try
      {
          int nm=10/0;
          
      }
      finally
      {
          System.out.println("I'm in try finally block ");
      }
   }
}
