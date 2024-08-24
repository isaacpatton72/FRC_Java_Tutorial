package Lesson7;

public class Multiplier {
    // Instance variable (class-level variable)
    int baseValue;

    // Constructor to initialize the base value
    Multiplier(int initialValue) {
        this.baseValue = initialValue;
    }

    // Method to multiply the base value by a specific multiplier
    void multiplyBy(int multiplier) {
        // Local variable (method scope)
        int result = baseValue * multiplier;

        // Print the result
        System.out.println("Multiplying " + baseValue + " by " + multiplier + " gives " + result);

        // Update the instance variable after the multiplication
        baseValue = result; // Local variable's value is assigned to the instance variable
    }

}
