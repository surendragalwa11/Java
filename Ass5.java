package Patterns;

import java.util.*;



public class Ass5
{

   
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of rows");
       int n=sc.nextInt();
      
        
      
       for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=i;j++)
         {
           System.out.print("*");
         }
        System.out.println();
       }
       
       int space=n-1;
        for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=space;j++)
         {
           System.out.print(" ");
         }
          space--;
         for(int k=1;k<=i;k++)
         {
              System.out.print("*");
         }
        System.out.println();
       }
       
    }
    
}
