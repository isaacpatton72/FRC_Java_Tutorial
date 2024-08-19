package Lesson5.Practice.Quiz;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("A quiz to test your knowledge on Methods in Java\n");

        // Question 1
        System.out.println("What is the primary purpose of methods in Java? \n(a) To define variables \n(b) To organize code into reusable blocks \n(c) To control program flow \n(d) To store objects\n");
        String answer1 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer1)) {
            System.out.println("Correct! Methods organize code into reusable blocks that perform specific tasks.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) To organize code into reusable blocks.");
            System.out.println("Explanation:");
            System.out.println("(a) To define variables: Variables are defined within methods but are not the primary purpose of methods.");
            System.out.println("(b) To organize code into reusable blocks: Correct! This is the main purpose of methods.");
            System.out.println("(c) To control program flow: While methods can affect program flow, their main purpose is to encapsulate reusable code.");
            System.out.println("(d) To store objects: Objects are stored in variables, not methods.\n");
        }

        // Question 2
        System.out.println("Which part of a method determines whether it will send back a value to where the method was called? \n(a) Method name \n(b) Return type \n(c) Parameters \n(d) Method body\n");
        String answer2 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer2)) {
            System.out.println("Correct! The return type indicates whether a method will return a value and what type of value it will return.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) Return type.");
            System.out.println("Explanation:");
            System.out.println("(a) Method name: The method name identifies the method but does not determine return behavior.");
            System.out.println("(b) Return type: Correct! The return type specifies what, if anything, the method will return.");
            System.out.println("(c) Parameters: Parameters provide input to the method but do not determine return behavior.");
            System.out.println("(d) Method body: The method body contains the code to be executed but does not define the return type.\n");
        }

        // Question 3
        System.out.println("What does the 'void' keyword indicate in a method declaration? \n(a) The method is private \n(b) The method will not return a value \n(c) The method has no parameters \n(d) The method is static\n");
        String answer3 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer3)) {
            System.out.println("Correct! 'void' indicates that the method does not return a value.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) The method will not return a value.");
            System.out.println("Explanation:");
            System.out.println("(a) The method is private: The access modifier 'private' determines visibility, not 'void'.");
            System.out.println("(b) The method will not return a value: Correct! 'void' means the method does not return any value.");
            System.out.println("(c) The method has no parameters: Parameters are defined separately, and 'void' does not indicate their presence or absence.");
            System.out.println("(d) The method is static: The 'static' keyword defines whether a method belongs to the class or instance, not 'void'.\n");
        }

        // Question 4
        System.out.println("Why might you use a method to perform an action on an object? \n(a) To modify the object's instance variables directly \n(b) To organize related actions and improve code readability \n(c) To avoid using instance variables \n(d) To initialize a new object\n");
        String answer4 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer4)) {
            System.out.println("Correct! Methods help organize actions related to an object, improving code readability and reusability.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) To organize related actions and improve code readability.");
            System.out.println("Explanation:");
            System.out.println("(a) To modify the object's instance variables directly: Methods can modify instance variables, but the purpose is broader.");
            System.out.println("(b) To organize related actions and improve code readability: Correct! Methods organize related actions, making code easier to read and maintain.");
            System.out.println("(c) To avoid using instance variables: Methods often interact with instance variables, not avoid them.");
            System.out.println("(d) To initialize a new object: This is the purpose of constructors, not general methods.\n");
        }

        // Question 5
        System.out.println("What is the 'method body' in Java? \n(a) The list of parameters passed into the method \n(b) The block of code that defines what the method does \n(c) The return type of the method \n(d) The name of the method\n");
        String answer5 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer5)) {
            System.out.println("Correct! The method body is the block of code within the method that defines its actions.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) The block of code that defines what the method does.");
            System.out.println("Explanation:");
            System.out.println("(a) The list of parameters passed into the method: Parameters are part of the method signature, not the method body.");
            System.out.println("(b) The block of code that defines what the method does: Correct! The method body contains the code that performs the method's task.");
            System.out.println("(c) The return type of the method: The return type is specified before the method body.");
            System.out.println("(d) The name of the method: The method name identifies the method but is not part of the method body.\n");
        }

        // Question 6
        System.out.println("What is the role of the 'return' keyword in a method? \n(a) It terminates the method and sends a value back to the caller \n(b) It defines the method's visibility \n(c) It passes arguments to the method \n(d) It creates a loop inside the method\n");
        String answer7 = scanner.nextLine();
        if ("a".equalsIgnoreCase(answer7)) {
            System.out.println("Correct! The 'return' keyword terminates the method and sends a value back to the caller if specified.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (a) It terminates the method and sends a value back to the caller.");
            System.out.println("Explanation:");
            System.out.println("(a) It terminates the method and sends a value back to the caller: Correct! 'return' ends the method and sends back a value.");
            System.out.println("(b) It defines the method's visibility: Visibility is defined by access modifiers like 'public', 'private', etc.");
            System.out.println("(c) It passes arguments to the method: Arguments are passed through parameters, not 'return'.");
            System.out.println("(d) It creates a loop inside the method: Loops are created using 'for', 'while', etc., not 'return'.\n");
        }

        // Question 7
        System.out.println("In the context of methods, what does the term 'parameters' refer to? \n(a) The return value of the method \n(b) The inputs the method requires to perform its task \n(c) The method's access level \n(d) The variables declared inside the method\n");
        String answer8 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer8)) {
            System.out.println("Correct! Parameters are the inputs required by the method to perform its task.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) The inputs the method requires to perform its task.");
            System.out.println("Explanation:");
            System.out.println("(a) The return value of the method: Parameters are inputs, not outputs.");
            System.out.println("(b) The inputs the method requires to perform its task: Correct! Parameters provide the necessary data for the method to work.");
            System.out.println("(c) The method's access level: Access level is defined by keywords like 'public' or 'private', not parameters.");
            System.out.println("(d) The variables declared inside the method: These are local variables, not parameters.\n");
        }

        // Question 8
        System.out.println("Which keyword would you use to define a method that does not return any value? \n(a) return \n(b) void \n(c) static \n(d) final\n");
        String answer9 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer9)) {
            System.out.println("Correct! The 'void' keyword indicates that the method does not return any value.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) void.");
            System.out.println("Explanation:");
            System.out.println("(a) return: The 'return' keyword is used to return a value, not to define a method as void.");
            System.out.println("(b) void: Correct! 'void' indicates no return value.");
            System.out.println("(c) static: 'static' defines whether the method belongs to the class or instance, not return behavior.");
            System.out.println("(d) final: 'final' prevents overriding, not related to return values.\n");
        }

        // Question 9
        System.out.println("When would you typically use a method with a return type other than 'void'? \n(a) When you want to terminate the program \n(b) When you want the method to perform an action and then provide a result \n(c) When you want the method to execute multiple times \n(d) When you want to print a value to the console\n");
        String answer11 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer11)) {
            System.out.println("Correct! A method with a return type other than 'void' performs an action and then provides a result back to the caller.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) When you want the method to perform an action and then provide a result.");
            System.out.println("Explanation:");
            System.out.println("(a) When you want to terminate the program: Methods do not typically terminate programs; this is handled differently.");
            System.out.println("(b) When you want the method to perform an action and then provide a result: Correct! Non-void methods return results.");
            System.out.println("(c) When you want the method to execute multiple times: This can be done with any method, not just those with return types.");
            System.out.println("(d) When you want to print a value to the console: Printing can be done in void methods as well.\n");
        }


        // Question 10
        System.out.println("How do you call a method named 'drive' on an object named 'car' in Java? \n(a) drive(car); \n(b) car.drive(); \n(c) Car.drive(); \n(d) drive();\n");
        String answer14 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer14)) {
            System.out.println("Correct! The syntax 'car.drive();' calls the 'drive' method on the 'car' object.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) car.drive();");
            System.out.println("Explanation:");
            System.out.println("(a) drive(car);: This would pass 'car' as a parameter to the 'drive' method, which is incorrect syntax for calling a method on an object.");
            System.out.println("(b) car.drive();: Correct! This is the correct syntax for calling the 'drive' method on the 'car' object.");
            System.out.println("(c) Car.drive();: This syntax would be used if 'drive' were a static method of the class 'Car'.");
            System.out.println("(d) drive();: This would work only if 'drive' were defined in the same scope and not tied to an object.\n");
        }

        // Question 11
        System.out.println("What happens when a method is called in Java? \n(a) The method's body is skipped and control returns to the caller \n(b) The method's code is executed, and then control returns to the caller \n(c) The program is terminated \n(d) The method's parameters are discarded\n");
        String answer15 = scanner.nextLine();
        if ("b".equalsIgnoreCase(answer15)) {
            System.out.println("Correct! When a method is called, its code is executed, and then control returns to the caller.\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is (b) The method's code is executed, and then control returns to the caller.");
            System.out.println("Explanation:");
            System.out.println("(a) The method's body is skipped and control returns to the caller: This would happen only if the method were not called.");
            System.out.println("(b) The method's code is executed, and then control returns to the caller: Correct! The method's instructions are executed.");
            System.out.println("(c) The program is terminated: Methods do not terminate programs unless explicitly coded to do so.");
            System.out.println("(d) The method's parameters are discarded: Parameters are used within the method, not discarded.\n");
        }

        System.out.println("Quiz completed! Your score is: " + score + "/11\n");
        scanner.close();
    }
}
