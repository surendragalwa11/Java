import java.util.*;
public class Interest
{
    
    public static void main(String[] args)
    {
        double p,r,t,simple_interest;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Principle amount:");
        p = sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        r = sc.nextDouble();
        System.out.println("Enter total time:");
        t = sc.nextDouble();
        
        simple_interest = (p*r*t)/100;
        System.out.println("Simple interest is:"+simple_interest);
        
        double CI = p * (Math.pow((1 + r / 100), t));
        System.out.println("Compound interest is:"+ (CI-p));
    }
    
}
