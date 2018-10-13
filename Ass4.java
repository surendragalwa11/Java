import java.util.*;

public class Ass4
{

   
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of rows");
       int n=sc.nextInt();
      
        
       //upper pattern
       int space=n-1;
       for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=space;j++)
         {
           System.out.print(" ");
         }
         space--;
         for(int k=1;k<=2*i-1;k++)
         {
             System.out.print("*");
         }
         System.out.println();
       }
       
       //down pattern
       space=1;
       for(int i=n-1;i>=1;i--)
       {
         for(int j=1;j<=space;j++)
         {
           System.out.print(" ");
         }
         space++;
         for(int k=1;k<=2*i-1;k++)
         {
             System.out.print("*");
         }
         System.out.println();
       }
       
    }
    
}
