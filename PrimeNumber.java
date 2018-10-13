
import java.util.*;


public class PrimeNumber
{

    public static void main(String[] args)
    {
        int a;
        int count=0;
        Scanner c=new Scanner(System.in);
        System.out.println("Enter any number ");
         a=c.nextInt();
           for(int i=2;i<a-1;i++)
           {
               if(a%i==0)
               {
                   System.out.println("not prime number ");
                   count++;
                   break;
               }
           }
           if(count==0)
           System.out.println("Prime");
    }
    
}
