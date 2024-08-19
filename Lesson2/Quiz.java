package Lesson2;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("A quiz to test your knowledge on White Space and Naming Variables in Java");

        // Question 1
        System.out.println("What does Java do with white space in code? (a) Interprets it as an error (b) Ignores it (c) Requires it for proper execution (d) Changes its meaning");
        String answer1 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer1)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) Ignores it.");
        }

        // Question 2
        System.out.println("What should you be careful of when adding white space within strings? (a) It will cause a syntax error (b) It adds extra spaces to the output (c) It changes the data type (d) It splits the string into multiple lines");
        String answer2 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer2)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) It adds extra spaces to the output.");
        }

        // Question 3
        System.out.println("Which convention is commonly used for naming variables in Java? (a) Snake case (b) Pascal case (c) Camel case (d) Kebab case)");
        String answer3 = scanner.nextLine();
        if ("c".equalsIgnoreCase(answer3)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (c) Camel case.");
        }

        // Question 4
        System.out.println("What is a good practice when naming variables? (a) Make the names as long as possible (b) Use random letters and numbers (c) Be specific enough but not overly specific (d) Always start with a capital letter)");
        String answer4 = scanner.nextLine();
        if ("c".equalsIgnoreCase(answer4)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (c) Be specific enough but not overly specific.");
        }

        // Question 5
        System.out.println("What is the result of adding a space within a Java keyword like 'System.out.print'? (a) It enhances readability (b) It causes an error (c) It changes the keyword's function (d) It allows for multiple commands)");
        String answer5 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer5)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) It causes an error.");
        }

        System.out.println("Quiz completed! Your score is: " + score + "/5");
        scanner.close();
    }
}
