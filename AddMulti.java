
package Matrix;
import java.util.*;

public class AddMulti
{

    
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of rows and column for both matrix");
       int r=sc.nextInt();
       
       
       
       int mat1[][]=new int[r][r];
       int mat2[][]=new int[r][r];
       int mat3[][]=new int[r][r];
       int mat4[][]=new int[r][r];
      
       System.out.println("Enter the values into first matix: ");
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<r;j++)
        {
         System.out.println("Enter the value of mat1[" + i+"]["+j+"]");
         mat1[i][j]=sc.nextInt();
        }
       }
       
       System.out.println("Enter the values into second matix: ");
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<r;j++)
        {
         System.out.println("Enter the value of mat2[" + i+"]["+j+"]");
         mat2[i][j]=sc.nextInt();
        }
       }
      
      //addition
      for(int i=0;i<r;i++)
      {
       for(int j=0;j<r;j++)
       {
         mat3[i][j]= mat1[i][j]+ mat2[i][j];
         
          //for multiplication
           for(int k=0;k<r;k++)
           {
              mat4[i][j]= mat4[i][j]+mat1[i][k]*mat2[k][j];
           }
        }
       }
      
      //for rows and column addition
      for(int i=0;i<r;i++)
      {
         int sum=0;
         int colSum=0;
         for(int j=0;j<r;j++)
         {
            
          sum=sum+mat1[i][j];
          colSum=colSum+mat1[j][i];  
         }
         System.out.println("The sum of element of "+i+"th row is "+sum);
         System.out.println("The sum of element of "+i+"th column is "+colSum);
      }
      
      
      //printing addition matrix
      System.out.println("Addition matrix is :");
      for(int i=0;i<r;i++)
      {
       for(int j=0;j<r;j++)
       {
        System.out.print(mat3[i][j]);
        System.out.print("    ");
       }
       System.out.println();
      }
      
       //printing multiplication matrix
      System.out.println("multiplication matrix is :");
      for(int i=0;i<r;i++)
      {
       for(int j=0;j<r;j++)
       {
        System.out.print(mat4[i][j]);
        System.out.print("    ");
       }
       System.out.println();
      }
    }
    
}
