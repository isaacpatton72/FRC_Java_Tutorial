package ObjectOrientedPart2;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Quiz: Understanding Object Oriented Programming Concepts");

        // Question 1
        System.out.println("\n1. What does a class represent in Object Oriented Programming?");
        System.out.println("a) An instance of an object\nb) The blueprint for an object\nc) A method to create objects\nd) A function to manipulate objects");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer1)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) The blueprint for an object");
        }

        // Question 2
        System.out.println("\n2. What is an attribute in a class?");
        System.out.println("a) A function that operates on data\nb) A variable that holds data about the object\nc) A method to create an object\nd) A way to store methods");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer2)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) A variable that holds data about the object");
        }

        // Question 3
        System.out.println("\n3. Why is it beneficial to use classes and objects in programming?");
        System.out.println("a) It makes it easier to organize and manage code\nb) It uses less memory \nc) It prevents errors in the code\nd) It speeds up the execution of the program");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();
        if ("a".equalsIgnoreCase(answer3)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is a) It makes it easier to organize and manage code.");
        }

        // Question 4
        System.out.println("\n4. What does the term 'OOP' stand for?");
        System.out.println("a) Object Organized Programming\nb) Objective Oriented Programming\nc) Object Oriented Programming\nd) Oriented Object Programming");
        System.out.print("Your answer: ");
        String answer4 = scanner.nextLine();
        if ("c".equalsIgnoreCase(answer4)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is c) Object Oriented Programming");
        }

        // Question 5
        System.out.println("\n5. Which of the following is an example of an attribute in the House class?");
        System.out.println("a) displayDetails()\nb) numberOfWindows\nc) calculateTotalCost()\nd) buildHouse()");
        System.out.print("Your answer: ");
        String answer5 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer5)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) numberOfWindows");
        }

        System.out.println("\nQuiz completed! Your score is: " + score + "/5");
        scanner.close();
    }
}
