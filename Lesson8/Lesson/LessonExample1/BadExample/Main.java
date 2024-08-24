package Lesson8.Lesson.LessonExample1.BadExample;

public class Main {
    public static void main(String[] args) {

        BankAccount adamsBankAccount = new BankAccount(); // Initialize bank with user info and balance
        adamsBankAccount.login("Adam", "1515"); // Attempt to login
        adamsBankAccount.readBalance(); // Attempt to read balance
        adamsBankAccount.withdraw(200.0); // Attempt to withdraw amount

    }
}
