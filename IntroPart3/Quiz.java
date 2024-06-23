package IntroPart3;

import java.util.Scanner;

public class Quiz {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Quiz: Understanding Java's Operators (basic symbols)");


        //  Question 1
        System.out.println("\n1. What does the assignment operator = do in Java?");
        System.out.println("a) Checks if two values are equal\nb) Adds two values together\nc) Assigns the value on its right to the variable on its left\nd) Subtracts one value from another");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        if ("c".equalsIgnoreCase(answer1)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is c) Assigns the value on its right to the variable on its left");
        }


        // Question 2
        System.out.println("\n2. What will be the output of the following code snippet?");
        System.out.println("""
                int number = 10;
                number = 5;
                System.out.println(number);
                """);
        System.out.println("a) 10\nb) 5\nc) 15\nd) 0");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer2)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) 5");
        }


        // Question 3
        System.out.println("\n3. Which of the following operators are considered math operators in Java?");
        System.out.println("a) =, +, -\nb) +, -, *, /, %\nc) ++, --\nd) ==, !=");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer3)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) +, -, *, /, %");
        }


        // Question 4
        System.out.println("\n4. What is the result of using the increment operator ++ on a variable with a value of 5?");
        System.out.println("a) 4\nb) 5\nc) 6\nd) 10");
        System.out.print("Your answer: ");
        String answer4 = scanner.nextLine();
        if ("c".equalsIgnoreCase(answer4)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is c) 6");
        }


        // Question 5
        System.out.println("\n5. Given Java's handling of strings and numbers with the + operator, what will be the output of the following code snippets?");
        System.out.println("System.out.println(\"Sum is: \" + 5 * 2 + 4);"); // Performs multiplication first, then concatenation: "Sum is: 104"
        System.out.println("System.out.println(\"Sum is: \" + (5 + 2 * 4));"); // Performs multiplication inside parentheses first, then addition, and finally concatenation: "Sum is: 13"
        System.out.println("a) Sum is: 104 and Sum is: 13\nb) Sum is: 13 and Sum is: 104\nc) Both will output Sum is: 13\nd) Both will output Sum is: 104");
        System.out.print("Your answer: ");
        String answer5 = scanner.nextLine();
        if ("a".equalsIgnoreCase(answer5)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is a) Sum is: 104 and Sum is: 13");
        }
        System.out.println("\nQuiz completed! Your score is: " + score + "/5");
        scanner.close();
    }
}