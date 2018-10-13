
import java.util.*;


public class dTOw
{

    
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of digits");
        int d=sc.nextInt();
        int arr[]=new int[d];
        int e=0;
        
        System.out.println("Enter digits between 0 to 9");
        for(int i=0;i<d;i++)
        {
        arr[i]=sc.nextInt();
        } 
        
        System.out.println("Number is");
        for(int i=0;i<d;i++)
        {
         e=e*10+arr[i];
        } 
        
        System.out.println(e);
    }
    
}
