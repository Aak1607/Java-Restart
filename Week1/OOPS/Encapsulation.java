package Week1.OOPS;

//How it works: Encapsulation allows data hiding and ensures controlled access to sensitive data.


class BankAccount {
    // Private fields
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500); // Balance is now 1500
        account.withdraw(200); // Balance is now 1300
        System.out.println("Current balance: " + account.getBalance());
    }
}

/*In this example, BankAccount encapsulates the balance field. Direct access to balance is restricted, and it’s only modified through controlled methods like deposit() and withdraw(), ensuring the balance is only changed through valid operations. */
