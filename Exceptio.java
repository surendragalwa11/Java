import java.util.*;

public class Exceptio 
{
    public static void main(String args[])
    {
        ArrayList<String> name=new ArrayList<String>();
        
        name.add("Mayura");
        name.add("Jyotsansa");
        name.add("Pooja");
        name.add("Ramya");
        name.add("Spurthi");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter item to find:(case sensitive) ");
        String find=sc.nextLine();
        String cap = find.substring(0, 1).toUpperCase() + find.substring(1);
       
        try
        {
          if(!name.contains(cap))
          {
           throw new showMessage(cap);
          }
          System.out.println("name exists");
        }
        catch(showMessage e)
        {
        System.out.println(e);
        }
    }
         
        
        /*Iterator<String> it=name.iterator();
        while(it.hasNext())
        {
            String obj=it.next();
            System.out.println(obj);
        }  */
    
}

class showMessage extends Exception
{
    String str2;
    showMessage(String str1)
    {
        str2=str1;
    }
    
    public String toString()
    {
        return("User defined exception occured "+str2+" is not present");
    }
}


/* 1.Create a user defined exception to check whether your employee exist 
in your data structure (use any data structure to store the employees - 
like array, ArrayList etc) and throw exception if name is not in the employees 
list.Use the exception correctly */