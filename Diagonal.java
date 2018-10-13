import java.util.*;


public class Diagonal
{

   
    public static void main(String[] args)
    {
        System.out.println("Enter the number of rows and columns ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        
      
        
        int [][]arr=new int[r][r];
        int sum=0;
        
        //insertig values into array
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<r;j++)
          {
              System.out.println("Enter the value of arr[" + i+"]["+j+"]");
              arr[i][j]=sc.nextInt();
          }
        }
        
        //adding all the diagonals
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<r;j++)
          {  
              if(i==j)
             sum=sum+arr[i][j];
          }
        }
     System.out.println("Sum of all the diagonal elements is"+ sum);
    }
}