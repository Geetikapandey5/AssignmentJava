import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int acc) { accountNumber = acc; }
    public int getAccountNumber() { return accountNumber; }

    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }

    public void withdraw(double amount) {
        if(amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        System.out.print("Enter Account Number: ");
        b.setAccountNumber(sc.nextInt());

        System.out.print("Enter amount to deposit: ");
        b.deposit(sc.nextDouble());

        System.out.print("Enter amount to withdraw: ");
        b.withdraw(sc.nextDouble());

        System.out.println("Account: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());
    }
}
