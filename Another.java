import java.util.*;
import java.io.*;
public class Another{
    
    public static void main(String[] args)
    {
        BankAccount test = new BankAccount();
        while(true)
        {
            System.out.println("Please select: 1.Account Balance  2.Deposit Money 3.Withdraw Money 4.Exit");
            Scanner scan = new Scanner(System.in);
            int s = scan.nextInt();
            if(s==1)
                test.printMethod();
            else if(s==2)
            {
                System.out.println("Please input the money you want to deposit:");
                int x = scan.nextInt();
                test.depositMethod(x);
            }
                
            else if(s==3)
            {
                System.out.println("Please input the money you want to withdraw:");
                int x = scan.nextInt();
                test.withdrawMethod(x);
            }
            else if(s==4)
                break;
            else 
                System.out.println("Please input the correct selection");
            
            
        }
        
    }
}

