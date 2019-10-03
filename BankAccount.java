import java.util.*;
import java.io.*;

public class BankAccount{

    String accountNumber;
    double balance;
    String customerName;
    String email;
    String phoneNumber;

    public BankAccount() {
        accountNumber = "123456789";
        balance = 50.0;
        customerName = "Charlie";
        email = "xichaowei95@gmail.com";
        phoneNumber = "8642607602";
        
    }
    public void depositMethod(double amount) {
        
        balance = balance + amount;
        System.out.println("The balance currently is " + balance);

      }
    public void withdrawMethod(double amount)
    {
        if(balance - amount < 0)
            System.out.println(customerName + ", Your balance is " + balance + ", so you do not have enough money to withdraw");
        
        else
        {
            balance = balance -  amount;
            System.out.println("The balance currently is " + balance);
        }
            
    }
    public void printMethod()
    {
        System.out.println("Customer Name is " + customerName);
        System.out.println("Account Number is " + accountNumber);
        System.out.println("Banlance is " + balance);
        System.out.println("Email is " + email);
        System.out.println("Phone number is " + phoneNumber);
        

    }
    public static void main(String[] args)
    {
        
    }
    
    
}

