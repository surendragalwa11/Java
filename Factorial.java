
import java.util.Scanner;

/*first mehthod
public class Factorial
{
    int  Factoriall(int a)
     {  
         if(a>1)
         a=a*Factoriall(a-1);
 
        return(a);
     }

    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int f=sc.nextInt();
        Factorial ff=new Factorial();
        System.out.println("The factorial is"+ff.Factoriall(f));
        
    }
    
}
*/

/* Second method
class Factorial
{
    public static void main(String args[])
    {
          int fact=1;
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        
        for(int i=1;i<number;i++)
        {
         
            fact=fact*i;
        }
        System.out.println("Factorial is "+ fact);
    }
}

*/

public class Factorial
{
    static int Factoriall(int a)
     {  
         if(a>1)
         a=a*Factoriall(a-1);
 
        return(a);
     }

    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int f=sc.nextInt();
        System.out.println("The factorial is"+Factoriall(f));
        
    }
    
}