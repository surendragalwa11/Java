
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WordFinder 
{

   
    public static void main(String[] args)
    {
        int i = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        System.out.println("Enter the word to find ");
        String word = sc.nextLine();
        
        System.out.println(countOccurences(str,word)); 
        
        /*
        Pattern p = Pattern.compile(e);
        Matcher m = p.matcher(str);
          while (m.find())
          {
          i++;
          }
        System.out.println(i);  */
    }
    
    
  

  
   static int countOccurences(String str, String word)  
   { 
    // split the string by spaces in a 
    String a[] = str.split(" "); 
  
    // search for pattern in a 
    int count = 0; 
       for (int i = 0; i < a.length; i++)  
       { 
    // if match found increase count 
         if(word.equals(a[i])) 
          count++; 
       } 
  
    return count; 
    } 
  
} 
  

