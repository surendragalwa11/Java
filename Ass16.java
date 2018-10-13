import java.util.*;
public class Ass16
{
    public static void main(String[] args)
    {
        int n=2,m=1,x=1,result=1;
        
        
        while(x<=8)
        {
            System.out.println(result);
            result = m*n;
            m = n;
            n = result;
            
            x++;
        }
        
    }
    
}
