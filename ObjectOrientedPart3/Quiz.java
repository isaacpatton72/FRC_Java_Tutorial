package ObjectOrientedPart3;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Quiz: Understanding Constructors and Classes");

        // Question 1
        System.out.println("\n1. What is the purpose of a constructor in Java?");
        System.out.println("a) To destroy an object\nb) To initialize an object\nc) To print data\nd) To concatenate strings");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer1)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) To initialize an object");
        }

        // Question 2
        System.out.println("\n2. How do you define a basic constructor in a class named 'House'?");
        System.out.println("a) public void House() {}\nb) public House() {}\nc) public house() {}\nd) public void house() {}");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer2)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) public House() {}");
        }

        // Question 3
        System.out.println("\n3. What does it mean to initialize a variable?");
        System.out.println("a) To declare its type\nb) To assign it a value\nc) To print its value\nd) To delete its value");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer3)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) To assign it a value");
        }

        // Question 4
        System.out.println("\n4. What are the values of the attributes set in this constructor?");
        System.out.println("House() { roofColor = \"Red\"; numberOfWindows = 5; wallMaterial = \"Brick\"; }");
        System.out.println("a) Blue, 10, Wood\nb) Green, 3, Stone\nc) Red, 5, Brick\nd) Yellow, 7, Metal");
        System.out.print("Your answer: ");
        String answer4 = scanner.nextLine();
        if ("c".equalsIgnoreCase(answer4)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is c) Red, 5, Brick");
        }

        // Question 5
        System.out.println("\n5. Why is it beneficial to use constructors with parameters?");
        System.out.println("a) To hardcode values\nb) To provide flexibility in initializing objects\nc) To print values\n d) To delete objects");
        System.out.print("Your answer: ");
        String answer5 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer5)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) To provide flexibility in initializing objects");
        }

        // Question 6
        System.out.println("\n6. What is a parameter?");
        System.out.println("a) A type of loop\nb) A value passed into a constructor or method\nc) A type of error\nd) A type of variable");
        System.out.print("Your answer: ");
        String answer6 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer6)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) A value passed into a constructor or method");
        }

        // Question 7
        System.out.println("\n7. What is the main advantage of using classes and objects in programming?");
        System.out.println("a) Easier to print data\nb) Better organization and management of code\nc) Faster execution time\nd) Less typing");
        System.out.print("Your answer: ");
        String answer7 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer7)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) Better organization and management of code");
        }

        // Question 8
        System.out.println("\n8. What does the following code do?");
        System.out.println("House house = new House(\"Blue\", 10, \"Wood\");");
        System.out.println("a) Deletes a house object\nb) Initializes a new house object with specified attributes\nc) Prints a house object\nd) Declares a house object");
        System.out.print("Your answer: ");
        String answer8 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer8)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) Initializes a new house object with specified attributes");
        }

        // Question 9
        System.out.println("\n9. What does the 'new' keyword do in Java?");
        System.out.println("a) Deletes an object\nb) Creates a new instance of an object\nc) Prints an object\nd) Initializes a variable");
        System.out.print("Your answer: ");
        String answer9 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer9)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) Creates a new instance of an object");
        }

        // Question 10
        System.out.println("\n10. How do you access the 'roofColor' attribute of a 'House' object named 'myHouse'?");
        System.out.println("a) myHouse.roofColor\nb) myHouse.getRoofColor()\nc) myHouse-roofColor\nd) myHouse::roofColor");
        System.out.print("Your answer: ");
        String answer10 = scanner.nextLine();
        if ("a".equalsIgnoreCase(answer10)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is a) myHouse.roofColor");
        }

        System.out.println("\nQuiz completed! Your score is: " + score + "/10");
        scanner.close();
    }
}
