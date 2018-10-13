
import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch
{
  static int a,b,c;
  
    static int BSearch(int arr[],int l,int r,int m)
    {
       if(r>l)
       {
           int mid=l+(r-1)/2;
           if(arr[mid]==m)
               return mid;
           if(arr[mid]<m)
               BSearch(arr,mid+1,r,m);
           if(arr[mid]>m)
               BSearch(arr,l,mid-1,m);

       }
       return -1;
    }
    
  public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of size");
        int d=sc.nextInt();
        int arr[]=new int[d];
        
        System.out.println("Enter numbers");
        for(int i=0;i<d;i++)
        {
        arr[i]=sc.nextInt();
        } 
        Arrays.sort(arr);
        
        
        System.out.println("Enter the number which you want to find");
        int n=sc.nextInt();
       int  result=BSearch(arr,0,d-1,n);
         
       if(result==-1)
       {
        System.out.println("doesn't exist in array");
       }
       else
       {
           System.out.println("After sorting,performing binary search This element is at position :"+result);
       }
     }
    
}
