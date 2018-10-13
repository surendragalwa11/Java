import java.util.*;
public class Ass19 {
    public static void main(String[] args)
    {
        int x,result=1,n;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        
        while(x>0)
        {
            n = x%10;
            result = result * n;
            x = x/10;
        }
        
        System.out.println(result);
    }
    
}
