
import java.util.*;


public class nTOw
{

    
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int d=sc.nextInt();
        String str="";
       
        int j=d;int k=0;
        while(j>=1)
        {
          k=k*10+(j%10);
          j=j/10;
        }
        
        while(k>=1)
        {
           int e=k%10;
           
           k=k/10;
             
           switch(e)
           {
               case 0: System.out.print("Zero ");break;
               case 1: System.out.print("One ");break;
               case 2: System.out.print("Two ");break;
               case 3: System.out.print("Three ");break;
               case 4: System.out.print("Four ");break;
               case 5: System.out.print("Five ");break;
               case 6: System.out.print("Six ");break;
               case 7: System.out.print("Seven ");break;
               case 8: System.out.print("Eight ");break;
               case 9: System.out.print("Nine ");break; 
               
             /*  case 0: str=str+"zero";break;
               case 1: str=str+"one";break;
               case 2: str=str+"two";break;
               case 3: str=str+"three";break;
               case 4: str=str+"four";break;
               case 5: str=str+"five";break;
               case 6: str=str+"six";break;
               case 7: str=str+"seven";break;
               case 8: str=str+"eight";break;
               case 9:str=str+"nine";break;
               
               StringBuilder bld=new StringBuilder();
               bld.append(str);
               System.out.println(bld.reverse());
             */
           }
        }
       
    }
    
}
