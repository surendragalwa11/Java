
package BankManagement;

import java.util.*;
public class Bank 
{
    static HashMap h = new HashMap();
    public static void main(String[] args)
    {
       // Account ac=new Account(0);
        double b=1000.0,r=2.0;
        Scanner sc = new Scanner(System.in);
        
        
        h.put(1001,1000.00);
        h.put(1002,2000.00);
        h.put(1003,3000.00);
        /*SavingAccount sa=new SavingAccount(b,r);
        sa.Credit();
        sa.Debit();
        sa.getBalance();
        */
        while(true)
        {
        System.out.println("Welcome to our Bank Management System");
        System.out.println("1.  Login by acount number");
        System.out.println("2.  Create a new account (Saving/Checking)");
        System.out.println("3.  Exit");
        System.out.println("4.  View all");

        System.out.println("Please enter your choice : ");


         switch(sc.nextInt())
         {
         case 1:  login();
                  break;
         case 2:  break;
         case 3:  System.exit(0);
         case 4:   break;
         }
        }
    }
         public static void login()
         {
             int acc,index,flag=0;
             
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter your 4 digit account number:");
             acc = sc.nextInt();
             Set s1 = h.entrySet();
        
             Iterator itr = s1.iterator();
             while(itr.hasNext())
             {
                Map.Entry m1 = (Map.Entry)itr.next();
               
                if(m1.getKey().equals(acc))
                {
                    flag=1;
                   System.out.println("Account exist");
                   System.out.println("1.Saving Account");
                   System.out.println("2.Checking Account(Chargable)");
                   System.out.println("Please enter your choice:");
                   
                   switch(sc.nextInt())
                   {
                       case 1:  savingAcc(acc);
                                break;
                       case 2:  checkingAcc(acc);
                                break;
                       default:System.out.println("Please enter correct choice!");
                   }
                }
             }
                if(flag==0)
                {
                    System.out.println("Account doesn't exist");
                }
         }
         public static void savingAcc(int acc)
         {
             double balance=0.0;
             Set s1 = h.entrySet();
             Iterator itr = s1.iterator();
             while(itr.hasNext())
             {
                Map.Entry m1 = (Map.Entry)itr.next();
                if(m1.getKey().equals(acc))
                {
                    balance = (double) m1.getValue();
                }
             }
            SavingAccount ac= new SavingAccount(balance,2);
            Scanner sc = new Scanner(System.in);
            
            System.out.println("1. View Balance");
            System.out.println("2. Calculate interest");
            System.out.println("3. Withdraw money");
            System.out.println("4. Deposit ");
            System.out.println("Please enter your choice:");
                   
            switch(sc.nextInt())
            {
                case 1:         System.out.println("Your account balance is:"+balance);
                                break;
                case 2:         ac.calculateInterest();
                                break;
                                
                case 3:         double balance1;
                                balance1=ac.Debit();
                                
                                Set s2 = h.entrySet();
                                Iterator itr1 = s2.iterator();
                                while(itr1.hasNext())
                                {
                                    Map.Entry m1 = (Map.Entry)itr1.next();
                                    //System.out.println("Your account balance is:"+m1.getValue());
                                    if(m1.getKey().equals(acc))
                                    {
                                        m1.setValue(balance1);
                                        System.out.println("Your account balance is:"+balance1);
                                    }
                                }
                                
                                break;
                case 4:         double balance2;
                                balance2=ac.Credit();
                                
                                Set s3 = h.entrySet();
                                Iterator itr2 = s3.iterator();
                                while(itr2.hasNext())
                                {
                                    Map.Entry m1 = (Map.Entry)itr2.next();
                                    //System.out.println("Your account balance is:"+m1.getValue());
                                    if(m1.getKey().equals(acc))
                                    {
                                        m1.setValue(balance2);
                                        System.out.println("Your account balance is:"+balance2);
                                    }
                                }
                                
                                break;
                default:System.out.println("Please enter correct choice!");
            }
             
            
         }
        

        public static void checkingAcc(int acc)
       {
           double balance=0.0;
             Set s1 = h.entrySet();
             Iterator itr = s1.iterator();
             while(itr.hasNext())
             {
                Map.Entry m1 = (Map.Entry)itr.next();
                if(m1.getKey().equals(acc))
                {
                    balance = (double) m1.getValue();
                }
             }
            CheckingAccount ac= new CheckingAccount(balance,20);
            Scanner sc = new Scanner(System.in);
            
            System.out.println("1. View Balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit ");
            System.out.println("Please enter your choice:");
                   
            switch(sc.nextInt())
            {
                case 1:         System.out.println("Your account balance is:"+balance);
                                break;
                case 2:         double balance1;
                                balance1=ac.Debit();
                                
                                Set s2 = h.entrySet();
                                Iterator itr1 = s2.iterator();
                                while(itr1.hasNext())
                                {
                                    Map.Entry m1 = (Map.Entry)itr1.next();
                                    //System.out.println("Your account balance is:"+m1.getValue());
                                    if(m1.getKey().equals(acc))
                                    {
                                        m1.setValue(balance1);
                                        System.out.println("Your account balance is:"+balance1);
                                    }
                                }
                                
                                break;
                case 3:         double balance2;
                                balance2=ac.Credit();
                                
                                Set s3 = h.entrySet();
                                Iterator itr2 = s3.iterator();
                                while(itr2.hasNext())
                                {
                                    Map.Entry m1 = (Map.Entry)itr2.next();
                                    //System.out.println("Your account balance is:"+m1.getValue());
                                    if(m1.getKey().equals(acc))
                                    {
                                        m1.setValue(balance2);
                                        System.out.println("Your account balance is:"+balance2);
                                    }
                                }
                                
                                break;
                default:System.out.println("Please enter correct choice!");
            }
             
            
    }

}

class Account
{
    double accountBalance=0.0;
    
    Scanner sc = new Scanner(System.in);
    
    Account(double balance)
    {
        if(balance>=0)
        {
            this.accountBalance = balance;
        }
        else
        {
            System.out.println("Initial account balance must be greater than zero");
        }
    }

    
    
    public double Credit()
    {
        double credit;
        System.out.print("Enter amount to credit:");
        credit = sc.nextDouble();
        accountBalance += credit;
        
        System.out.println(credit+" rupees credited successfully");
        return(accountBalance);
    }
    
    public double Debit()
    {
        double debit;
        System.out.print("Enter amount to debit:");
        debit = sc.nextDouble();
        
        if(debit <= accountBalance)
        {
            accountBalance -= debit;
            System.out.println(debit+" rupees debited successfully");
            //System.out.println("Your account balance is:"+accountBalance);
            return(accountBalance);
        }
        else
        {
            System.out.println("Debit amount exceeded account balance");
        }
        return(accountBalance);
    }
    
    void getBalance()
    {
        System.out.println("Your account balance is "+accountBalance);
    }
}

class SavingAccount extends Account
{
    double interestRate=0.0;
   
    SavingAccount(double savingBalance,double Irate)
    {
        super(savingBalance);
        
        this.interestRate = Irate;
    }
    
    public void calculateInterest()
    {
        System.out.println("Your total interest is "+(accountBalance*interestRate/100));
    }
}

class CheckingAccount extends Account
{
  double feeCharge;
  CheckingAccount(double checkingBalance,double Fcharge)
  {
      super(checkingBalance);
      this.feeCharge=Fcharge;
  }
  
  @Override
  public double Debit()
  {
      double debit;
      System.out.print("Enter amount to debit:");
      debit = sc.nextDouble();
        
      if(debit <= accountBalance)
      {
         accountBalance -= debit+feeCharge;
         System.out.println(debit+" rupees debited successfully");
         return accountBalance;
        }
        else
        {
            System.out.println("Debit amount exceeded account balance");
        }
      return(accountBalance);
  }
  
  @Override
  public double Credit()
    {
        double credit;
        System.out.print("Enter amount to credit:");
        credit = sc.nextDouble();
        accountBalance += credit-feeCharge;
        
        System.out.println(credit+" rupees credited successfully");
        
        return accountBalance;
    }
}