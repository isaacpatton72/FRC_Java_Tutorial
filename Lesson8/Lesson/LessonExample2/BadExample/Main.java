package Lesson8.Lesson.LessonExample2.BadExample;

public class Main {
    public static void main(String[] args) {

                /*
        These are all the available methods that can be called on the BankAccount object:
        - login(String username, String password): boolean
        - withdraw(double amount): void
        - deposit(double amount): void
        - readBalance(): void
        - resetPassword(String newPassword): void
        - requestPasswordReset(String currentPassword, String newPassword): void
         */ 

        BankAccount adamsBankAccount = new BankAccount(); // Initialize bank with user info and balance
        adamsBankAccount.login("Adam", "1515"); // Attempt to login
        adamsBankAccount.resetPassword("0");
        adamsBankAccount.readBalance(); // Attempt to read balance
        adamsBankAccount.withdraw(200.0); // Attempt to withdraw amount

    }
}
