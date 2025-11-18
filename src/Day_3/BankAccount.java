package Day_3;

import java.util.Scanner;

class Account {
    protected int accountID;
    protected String holdername;
    protected double balance;
    public Account(int accountID, String holdername, double balance){
        if(accountID>= 100 && accountID<=999){
            this.accountID= accountID;
        }
        else{
            this.accountID= -1;
        }
        this.holdername= holdername;
        if(balance>=0){
            this.balance= balance;
        }
        else{
            this.balance= 0;
        }

    }
    public void setAccountBalance(double balance){
        if(balance>=0){
            this.balance= balance;
        }
        else{
            this.balance= 0;
        }
        System.out.println("The account balance is: "+ this.balance);
    }

    public double credit(double amount){
        if(amount>0){
            this.balance += amount;
        }
        return this.balance;
    }

    public void printAccountDetails(){
        System.out.println("Account ID: "+ this.accountID);
        System.out.println("Account Holder Name: "+ this.holdername);
        System.out.println("Account Balance: "+ this.balance);
    }


    
}

class VIPAccount extends Account{
    

    public VIPAccount(int accountID, String holdername, double balance ){
        super(accountID, holdername, balance);
        
    }

    @Override
    public void setAccountBalance(double balance){
        if(balance>= 10000){
            this.balance= balance;
        }
        else{
            this.balance= 10000;
        }
        System.out.println("The VIP account balance is: "+ this.balance);
    }

    
    
}

public class BankAccount {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    int id = sc.nextInt();
    sc.nextLine();
    String name = sc.nextLine();
    double balance = sc.nextDouble();
    double credit = sc.nextDouble();
    double negative = sc.nextDouble();
    Account acc = new Account(id, name, balance);
    acc.printAccountDetails();
    acc.setAccountBalance(balance);
    acc.credit(1000);
    acc.printAccountDetails();
    VIPAccount vip = new VIPAccount(id, name, balance);
    vip.printAccountDetails();
    vip.setAccountBalance(balance);
    sc.close();
    }

}
