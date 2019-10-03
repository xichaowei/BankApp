import java.util.*;
import java.io.*;

public class BankAccount{

    String accountNumber;
    String lastName;
    String firstName;
    double balance;
    String email;
    String phoneNumber;
    double deposit_limited;
    double withdraw_limited;
    int deposit_count;
    String accountType;
    List<String> transaction_history = new ArrayList<String>();
    public BankAccount() {
        accountNumber = "123456789";
        balance = 50.0;
        firstName = "Charlie";
        lastName = "Wei";
        email = "xichaowei95@gmail.com";
        phoneNumber = "8642607602";
        deposit_count = 0;
        deposit_limited = 0.0;
        withdraw_limited = 1000;
        accountType = "Saving Account";
        
    }
    public void depositMethod(double amount) {
        
        if(deposit_limited>1500)
        {
            System.out.println("Failed ! Your daily deposit amount is 1500 !");
            return;
        }
        
        if(deposit_count>=3)
        {
            System.out.println("Failed ! 3 deposits allowed per day !");
            return;
        }
        
        if(amount<50 || amount>500)
        {
            System.out.println("Failed ! The deposit amount range is  50 - 500 !");
            return;
        }
        if(amount>=50 && amount<=500)
        {
            balance = balance + amount;
            System.out.println("The balance currently is " + balance);
            deposit_limited = deposit_limited + amount;
            deposit_count = deposit_count + 1;
            
            Date date = new Date();
            String a = date.toString() + ": Deposit " + amount  + " successfully !"; 
            transaction_history.add(a);
        }
        

      }
    public void withdrawMethod(double amount)
    {
        if(withdraw_limited<=0)
            System.out.println("Failed ! Your limit of daily withdraw amount is 1000 !");
        else{
            if(balance - amount < 0)
                System.out.println(lastName + ", Your balance is " + balance + ", so you do not have enough money to withdraw");
            else
            {
                balance = balance -  amount;
                withdraw_limited = withdraw_limited - amount;
                
                Date date = new Date();
                String a = date.toString() + ": Withdraw " + amount  + " successfully !"; 
                transaction_history.add(a);
            }
        }
         System.out.println("Your current account balance is " + balance);
         System.out.println("Your remaining daily limit of withdraw is " + withdraw_limited);
        
           
            
    }
    public void printMethod()
    {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println("Customer Name: " + lastName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Banlance: " + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Account Type: " + accountType);
        
    }
    public void transactionMethod()
    {
        for(String t:transaction_history)
            System.out.println(t);    
    }
    public static void main(String[] args)
    {
        
    }
    
    
}

