//This is a runnable quiz you just have to hit the execute button to run the quiz
package Lesson2;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Quiz: Understanding Java Whitespace and Print Statements");

        // Question 1
        System.out.println("1. What will be the output of the following code snippet?\nSystem.out.println(\"print statement number ___\");");
        System.out.println("a) An error\nb) print statement number ___\nc) print statement number\n");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer1)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) print statement number ___");
        }

        // Question 2
        System.out.println("\n2. Does Java consider whitespace within quotation marks as part of the string?");
        System.out.println("a) Yes\nb) No");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if ("a".equalsIgnoreCase(answer2)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is a) Yes");
        }

        // Question 3
        System.out.println("\n3. Does Java care about whitespace outside the quotation marks in a print statement?");
        System.out.println("a) Yes\nb) No");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer3)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) No");
        }

    // Question 4
    System.out.println("\n4. What should be placed in the blank to correctly display: print statement number 1?");
    System.out.println("System.out.println(\"print statement number ___\");");
    System.out.println("a) 1\nb) \"1\"");
    System.out.print("Your answer: ");
    String answer4 = scanner.nextLine();
    if ("c".equalsIgnoreCase(answer4)) {
        System.out.println("Correct! The correct answer is a) 1");
        score++;
    } else {
        System.out.println("""
            Incorrect. The correct answer is a) 1 since adding
            quotation marks in a string would make it dipslay 
            the quotation marks""");
    }


        System.out.println("\nQuiz completed! Your score is: " + score + "/4");
        scanner.close();
    }
}