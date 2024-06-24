package IntroPart3;

class Main {

    public static void main(String[] args) {
        /*
         * this lesson is aimed at teaching about how to modify the data types in java.
         * This will cover the assignment operateor, string combination, the math operators, 
         * and the increment and decrement operators.
         * In other words: 
         * =                    assignment operator
         * +, -, *, /, %        math operators
         * ++, --               increment and decrement operators
         */



        // Assignment Operator
        // The assignment operator '=' is used to assign values to variables.
        /*
         * The assignment operator (=) in Java is used for assigning values to variables, not for 
         * indicating mathematical equality. It takes the value on its right and stores it in the 
         * variable on its left. Unlike in mathematics, where the equals sign (=) denotes that two 
         * expressions are equivalent, in programming, it signifies a value assignment. For example, 
         * int number = 10; assigns the value 10 to the variable number. Another significant point is
         * that operator assigns the thing on the right to the thing on the left. This means that the
         * variable on the left side of the operator is the one that will be changed. It also has the 
         * ability to not only create a new value but to reasign it as well. For example, if you have
         * int number = 10; and then you have number = 5; the value of number will be 5 and not 10.
         */
        
        // Example of assignment operator
        int number = 10; // Assigns 10 to number
        System.out.println("Initial assignment: number = " + number);


        // Reassigning a new value to the variable number
        System.out.println("Initial value of number: " + number);
        number = 5; // Changes the value of number to 5
        System.out.println("After reassignment: number = " + number);

        // Demonstrating that the variable on the left is the one that gets changed
        int anotherNumber = 20;
        System.out.println("Initial value of number: " + number);
        number = anotherNumber; // Now, number will have the value of anotherNumber
        System.out.println("After assigning another variable's value: number = " + number);



        // String Concatenation (the fancy word for combining two strings together)
        /*
         * In Java, you can put strings together using the + sign. For example, if you write String 
         * greeting = "Hello, " + "world!";, you get "Hello, world!". You can also add numbers to 
         * strings this way. So, String ageText = "I am " + 30 + " years old."; turns into "I am 30 
         * years old.". This is a simple way to mix words and numbers in your text.
         */

        // Combining two strings
        String greeting = "Hello, " + "world!";
        System.out.println(greeting); // Prints: Hello, world!

        // Adding a number to a string
        String ageText = "I am " + 30 + " years old.";
        System.out.println(ageText); // Prints: I am 30 years old.

        // Combining strings with variables
        String name = "Alice";
        String introduction = "My name is " + name + ".";
        System.out.println(introduction); // Prints: My name is Alice.







        // Math Operators
        // Java provides several operators for performing arithmetic operations.
        // Addition (+)
        int sum = number + 5;
        System.out.println("Addition: number + 5 = " + sum);

        // Subtraction (-)
        int difference = number - 5;
        System.out.println("Subtraction: number - 5 = " + difference);

        // Multiplication (*)
        int product = number * 5;
        System.out.println("Multiplication: number * 5 = " + product);

        // Division (/)
        int quotient = number / 5;
        System.out.println("Division: number / 5 = " + quotient);

        // Modulus (%)
        // The modulus operator returns the remainder of a division operation.
        int remainder = number % 3;
        System.out.println("Modulus: number % 3 = " + remainder);

        // Increment and Decrement Operators
        // These operators increase or decrease the value of a variable by 1.
        // Increment (++)
        System.out.println("Initial value of number: " + number);
        number++;
        System.out.println("Increment: number++ = " + number);

        System.out.println("Initial value of number: " + number);
        // Decrement (--)
        number--;
        System.out.println("Decrement: number-- = " + number);

        // Compound Assignment Operators
        // These operators combine a math operation with assignment.
        // Addition and assignment (+=)
        System.out.println("Initial value of number: " + number);
        number += 5; // Equivalent to number = number + 5
        System.out.println("Addition and Assignment: number += 5 -> " + number);

        // Subtraction and assignment (-=)
        System.out.println("Initial value of number: " + number);
        number -= 5; // Equivalent to number = number - 5
        System.out.println("Subtraction and Assignment: number -= 5 -> " + number);







        //PEMDAS
        /*
        In Java, mathematical operations follow a set of rules known as PEMDAS, which stands for Parentheses, Exponents, 
        Multiplication and Division (from left to right), Addition and Subtraction (from left to right). This rule helps 
        determine the order in which operations are performed in an expression. While Java directly applies PEMDAS to 
        mathematical operations, its principles can also influence how we understand operations involving strings and other 
        data types.
        */

        // PEMDAS for Mathematical Operations
        // Parentheses (): Operations inside parentheses are performed first. If there are nested parentheses, the innermost 
        // parentheses are evaluated first.
        int result = (2 * (3 + (4 - 1))) + 5;
            // Breakdown of the operation:
            // 1. Innermost parentheses: (4 - 1) = 3
            // 2. Next level of parentheses: (3 + 3) = 6
            // 3. Multiplication inside outer parentheses: 2 * 6 = 12
            // 4. Addition outside parentheses: 12 + 5 = 17


        System.out.println("The result is: " + result); // Outputs: The result is: 17

        // Exponents: We will talk more about how to do exponents later.


        // Multiplication * and Division /: These operations are performed next, from left to right. It's important to 
        //note that division by zero will result in an ArithmeticException.
        // Modulo %: The modulo operation is performed on the same level as multiplication and division.
        // Addition + and Subtraction -: Finally, addition and subtraction are performed, also from left to right.

        // PEMDAS and Strings
        // In Java, the + operator is also used for string concatenation. When used with strings, + performs concatenation 
        //from left to right, which can lead to interesting results when mixed with other data types.

        //Strings and Numbers: When a string is involved in an operation with + and a numeric value, Java converts 
        //the number to a string and joins them.
        //Order Matters: If the + operator is used between numbers before it's used with a string, Java will perform arithmetic 
        //addition first, then concatenate. If a string comes first, subsequent numbers are treated as strings and concatenated.
        // Example:
        System.out.println("The total is: " + 2 + 3); // This will say: The total is: 23
        System.out.println("The total is: " + (2 + 3)); // This will correctly say: The total is: 5
        // In the first line, 2 and 3 are treated as strings and concatenated because the operation 
        //starts with a string. In the second line, parentheses force 2 + 3 to be evaluated as 
        //arithmetic addition first.



    }

}
