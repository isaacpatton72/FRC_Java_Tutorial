package Lesson1;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("A quiz to test your knowledge on data types in Java");

        // Question 1
        System.out.println("What is the best data type for the age of a person? (int/String/boolean/double/float)");
        String answer1 = scanner.nextLine();
        if ("int".equalsIgnoreCase(answer1)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is int.");
        }

        // Question 2
        System.out.println("What is the best data type for the name of a person? (int/String/boolean/double/float)");
        String answer2 = scanner.nextLine();
        if ("String".equalsIgnoreCase(answer2)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is String.");
        }

        // Question 3
        System.out.println("What is the best data type for whether or not a person is a student? (int/String/boolean/double/float)");
        String answer3 = scanner.nextLine();
        if ("boolean".equalsIgnoreCase(answer3)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is boolean.");
        }

        // Question 4
        System.out.println("What is the best data type for the price of a hamburger? (int/String/boolean/double/float)");
        String answer4 = scanner.nextLine();
        if ("double".equalsIgnoreCase(answer4) || "float".equalsIgnoreCase(answer4)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answers are double or float.");
        }

        // Question 5
        System.out.println("What is the best data type for the hour on a digital clock? (int/String/boolean/double/float)");
        String answer5 = scanner.nextLine();
        if ("int".equalsIgnoreCase(answer5)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is int.");
        }

        System.out.println("Quiz completed! Your score is: " + score + "/5");
        scanner.close();
    }
}