
import java.util.*;


public class ResultOfStudents 
{

    
    public static void main(String[] args)
    {
         int a,b;
         Scanner sc=new Scanner(System.in);
        
         for( int i=1;i<=3;i++)
         {
             int sum=0;double result=0;
             System.out.println("Enter the marks of student "+i);
             for(int j=1;j<=3;j++)
             {
                 
                 System.out.println("Enter the marks of subject "+i);
                 sum=sum+sc.nextInt();
             }
             result=sum/3;
             
             if(result>=75)
                 System.out.println("Distinction");
            else if(result>=60 )
                 System.out.println("First class");
            else if(result>=45)
                 System.out.println("Second class");
            else if(result>=33)
                 System.out.println("Third class");
             else
                System.out.println("Sorry this guy has been failed!");
         }
    }
    
}
