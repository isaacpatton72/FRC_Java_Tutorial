package Lesson8.Lesson.LessonExample1.BadExample;

public class BankAccount {
    String username; // Stores the username
    String password; // Stores the password
    boolean isLoggedIn; // Indicates whether the user is logged in
    double balance; // Stores the balance of the user

    /**
     * Constructor to initialize the bank with a specific username, password, and initial balance.
     */
    public BankAccount() {
        username = "Adam";
        password = "1515";
        balance = 500;
        isLoggedIn = false;
    }

    /**
     * Method to login to the bank system.
     */
    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            isLoggedIn = true;
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    /**
     * Method to withdraw an amount from the user's balance. Only accessible if logged in.
     * 
     * @param amount The amount to withdraw
     */
    public void withdraw(double amount) {
        if (isLoggedIn) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful! New balance: " + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Access denied. Please login first.");
        }
    }

    /**
     * Method to deposit an amount to the user's balance. Only accessible if logged in.
     * 
     * @param amount The amount to deposit
     */
    public void deposit(double amount) {
        if (isLoggedIn) {
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Access denied. Please login first.");
        }
    }

    /**
     * Method to read the current balance. Only accessible if logged in.
     */
    public void readBalance() {
        if (isLoggedIn) {
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Access denied. Please login first.");
        }
    }
}