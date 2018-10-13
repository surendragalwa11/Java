
import java.util.Arrays;
import java.util.Scanner;


public class MinMaxAvg
{
  static int a,b,c;
  
    
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of size");
        int d=sc.nextInt();
        int arr[]=new int[d];
        double sum=0;
        
        System.out.println("Enter numbers");
        for(int i=0;i<d;i++)
        {
        arr[i]=sc.nextInt();
        sum=sum+arr[i];
        } 
        
        //bubble sort
       /* for(int i=0;i<d-1;i++)
        {
          for(int j=0;j<d-i-1;j++)
          {
             if(arr[j]>arr[j+1])
             {
              int temp=arr[j+1];
              arr[j+1]=arr[j];
              arr[j]=temp;
              }
           }
        } */
       
       Arrays.sort(arr);
        
        System.out.println("Max is "+ arr[d-1]+" min is "+ arr[0]);
         System.out.println("Average is  "+ (sum/d));
         
          System.out.print("Sorted list is: ");
        for(int i=0;i<d;i++)
        {
        System.out.print(arr[i] );
        } 
    }
    
}
