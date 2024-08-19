package Lesson4.Practice.Quiz;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("A quiz to test your knowledge on Object-Oriented Programming in Java\n");

        // Question 1
        System.out.println("What is a 'class' in Java? \n(a) A function that performs a specific task \n(b) A blueprint for creating objects \n(c) A variable that holds data \n(d) A loop that iterates through data\n");
        String answer1 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer1)) {
            System.out.println("Correct! A class is a blueprint for creating objects. It defines the properties and behaviors that the objects created from it will have.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) A blueprint for creating objects.\n");
            System.out.println("Explanation:");
            System.out.println("(a) A function that performs a specific task: This describes a method, not a class.");
            System.out.println("(b) A blueprint for creating objects: Correct! A class defines the structure and behavior of objects.");
            System.out.println("(c) A variable that holds data: This describes an instance variable or field within a class, not the class itself.");
            System.out.println("(d) A loop that iterates through data: This describes a control structure like a 'for' or 'while' loop, not a class.\n");
        }

        // Question 2
        System.out.println("What are 'instance variables' in a class? \n(a) Variables that belong to a class \n(b) Variables that hold specific attributes of an object \n(c) Variables that change their value frequently \n(d) Variables that are local to a method\n");
        String answer2 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer2)) {
            System.out.println("Correct! Instance variables are variables defined in a class for which each instantiated object of the class has its own separate copy.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) Variables that hold specific attributes of an object.\n");
            System.out.println("Explanation:");
            System.out.println("(a) Variables that belong to a class: This describes static variables, which are shared among all instances of a class.");
            System.out.println("(b) Variables that hold specific attributes of an object: Correct! Instance variables represent the attributes of an individual object.");
            System.out.println("(c) Variables that change their value frequently: The frequency of change is not what defines an instance variable.");
            System.out.println("(d) Variables that are local to a method: This describes local variables, not instance variables.\n");
        }

        // Question 3
        System.out.println("What does a 'Constructor' do in a Java class? \n(a) It initializes the state of an object \n(b) It destroys an object \n(c) It performs a specific action \n(d) It creates a copy of an object\n");
        String answer3 = scanner.nextLine();
        if ("a".equalsIgnoreCase(answer3)) {
            System.out.println("Correct! A Constructor initializes an object when it is created. It sets up the initial state of the object.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (a) It initializes the state of an object.\n");
            System.out.println("Explanation:");
            System.out.println("(a) It initializes the state of an object: Correct! The Constructor is responsible for setting up the initial state of a newly created object.");
            System.out.println("(b) It destroys an object: Object destruction is handled by the garbage collector, not the Constructor.");
            System.out.println("(c) It performs a specific action: Methods, not Constructors, are typically used to perform specific actions.");
            System.out.println("(d) It creates a copy of an object: Copy constructors or cloning mechanisms are used for creating copies of objects, but this is not the general role of a Constructor.\n");
        }

        // Question 4
        System.out.println("Which keyword is used to refer to the current object within a method or Constructor? \n(a) self \n(b) this \n(c) super \n(d) object\n");
        String answer4 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer4)) {
            System.out.println("Correct! The 'this' keyword is used to refer to the current object within a method or Constructor.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) this.\n");
            System.out.println("Explanation:");
            System.out.println("(a) self: This keyword is used in some other programming languages like Python, not in Java.");
            System.out.println("(b) this: Correct! 'this' refers to the current object instance.");
            System.out.println("(c) super: 'super' is used to refer to the parent class, not the current object.");
            System.out.println("(d) object: There is no 'object' keyword in Java that serves this purpose.\n");
        }

        // Question 5
        System.out.println("What happens if you do not define a Constructor in a Java class? \n(a) Java generates a default Constructor \n(b) The class cannot be instantiated \n(c) The program will crash \n(d) Java automatically defines all instance variables\n");
        String answer5 = scanner.nextLine();
        if ("a".equalsIgnoreCase(answer5)) {
            System.out.println("Correct! Java automatically provides a default Constructor if none is defined, allowing the class to be instantiated without additional parameters.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (a) Java generates a default Constructor.\n");
            System.out.println("Explanation:");
            System.out.println("(a) Java generates a default Constructor: Correct! Java provides a default Constructor if none is explicitly defined.");
            System.out.println("(b) The class cannot be instantiated: Incorrect, because the default Constructor allows instantiation.");
            System.out.println("(c) The program will crash: This is not true; Java handles the situation gracefully by providing a default Constructor.");
            System.out.println("(d) Java automatically defines all instance variables: Instance variables are defined when declared, not automatically by Java.\n");
        }

        // Question 6
        System.out.println("What is the significance of 'null' in Java? \n(a) It is a keyword used to define objects \n(b) It represents the absence of an object \n(c) It is used to initialize objects \n(d) It is a loop variable\n");
        String answer6 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer6)) {
            System.out.println("Correct! 'null' in Java indicates that a reference variable does not point to any object, representing the absence of an object.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) It represents the absence of an object.\n");
            System.out.println("Explanation:");
            System.out.println("(a) It is a keyword used to define objects: 'null' is a special literal, not a keyword for object definition.");
            System.out.println("(b) It represents the absence of an object: Correct! 'null' is used to indicate that a reference variable does not point to any object.");
            System.out.println("(c) It is used to initialize objects: 'null' does not initialize objects; it represents the absence of one.");
            System.out.println("(d) It is a loop variable: 'null' has no role as a loop variable in Java.\n");
        }

        // Question 7
        System.out.println("Why would you use multiple Constructors in a Java class? \n(a) To handle different types of exceptions \n(b) To allow objects to be created in different ways \n(c) To perform different actions based on conditions \n(d) To create multiple copies of the same object\n");
        String answer7 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer7)) {
            System.out.println("Correct! Multiple Constructors allow objects to be instantiated with different sets of parameters, providing flexibility in object creation.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) To allow objects to be created in different ways.\n");
            System.out.println("Explanation:");
            System.out.println("(a) To handle different types of exceptions: Exceptions are handled using try-catch blocks, not Constructors.");
            System.out.println("(b) To allow objects to be created in different ways: Correct! Overloaded Constructors enable object creation with various sets of data.");
            System.out.println("(c) To perform different actions based on conditions: This is done through methods, not Constructors.");
            System.out.println("(d) To create multiple copies of the same object: Copying objects is typically done using cloning mechanisms, not multiple Constructors.\n");
        }

        // Question 8
        System.out.println("What does the following statement do? 'Car myFerrari = new Car(\"Ferrari\", \"812 GTS\", 2023, \"Red\");' \n(a) Creates a new Car object \n(b) Prints the details of the car \n(c) Deletes an existing Car object \n(d) Modifies the color of the car\n");
        String answer8 = scanner.nextLine();
        if ("a".equalsIgnoreCase(answer8)) {
            System.out.println("Correct! This statement creates a new instance of the Car class with the specified parameters.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (a) Creates a new Car object.\n");
            System.out.println("Explanation:");
            System.out.println("(a) Creates a new Car object: Correct! This statement calls the Constructor of the Car class to create a new object.");
            System.out.println("(b) Prints the details of the car: The statement does not include any print commands.");
            System.out.println("(c) Deletes an existing Car object: Object deletion in Java is handled by the garbage collector, and this statement does not perform that action.");
            System.out.println("(d) Modifies the color of the car: The statement creates a new object; it does not modify an existing one.\n");
        }

        System.out.println("Quiz completed! Your score is: " + score + "/8\n");
        scanner.close();
    }
}
