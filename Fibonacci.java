
import java.util.Scanner;


public class Fibonacci 
{
   static int a=0,b=1,c;
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of fibonacci series ");
        int d=sc.nextInt();
        
        for(int i=1;i<d-1;i++)
        {
        c= a + b;
         System.out.println(c);
        a=b;b=c;
        }
        
    }
    
}
