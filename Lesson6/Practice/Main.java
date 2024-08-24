package Lesson6.Practice;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("Welcome to the Magic Potion Brewing game!");
        System.out.println("To brew the potion successfully, you must mix the correct ingredients in the right amounts, at the right temperature, and at the right time.");

        // Prompt the player for the amount of unicorn tears (in ml)
        System.out.println("Enter the amount of unicorn tears (in ml, between 50 and 100):");
        int unicornTears = scanner.nextInt();

        // Prompt the player for the amount of dragon scales (in grams)
        System.out.println("Enter the amount of dragon scales (in grams, between 10 and 50):");
        int dragonScales = scanner.nextInt();

        // Prompt the player for the temperature of the cauldron (in degrees Celsius)
        System.out.println("Enter the temperature of the cauldron (in degrees Celsius, between 80 and 100):");
        int temperature = scanner.nextInt();

        // Prompt the player for the time spent stirring (in minutes)
        System.out.println("Enter the time spent stirring (in minutes, between 5 and 15):");
        int stirringTime = scanner.nextInt();

        // Create a MagicPotion object with the provided inputs
        Potion potion = new Potion(unicornTears, dragonScales, temperature, stirringTime);

        // Brew the potion and provide feedback
        potion.brewPotion();

        scanner.close();
    }
}
