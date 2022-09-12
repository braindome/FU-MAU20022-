import java.util.Scanner;

public class Account {
    String name;
    double balance;
    Scanner sc = new Scanner(System.in);


    public void resetBalance() {
        this.balance = 0;
    }

    public void inputBalance(double number) {
        this.balance = number;
    }

    public void deposit(double number) {
        double inCash;
        System.out.println("Amount to deposit:");
        inCash = number;
        balance = balance + inCash;
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double number) {
        double outCash;
        System.out.println("Amount to withdraw:");
        outCash = number;
        balance = balance - outCash;
        System.out.println("Balance: " + balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameBalance(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String toString() {
        System.out.println(name + " has this many monies in their account: " + balance);
        return name + " has this many monies in their account: " + balance;
    }
}
