package Lesson6.Practice;

public class Potion {

    // Attributes for the potion
    int unicornTears;
    int dragonScales;
    int temperature;
    int stirringTime;

    // Constructor to initialize the potion attributes
    Potion(int unicornTears, int dragonScales, int temperature, int stirringTime) {
        this.unicornTears = unicornTears;
        this.dragonScales = dragonScales;
        this.temperature = temperature;
        this.stirringTime = stirringTime;
    }

    // Method to check if the ingredients are correct
    boolean hasCorrectIngredients() {
        return (unicornTears >= 50 && unicornTears <= 100) &&
                (dragonScales >= 10 && dragonScales <= 50);
    }

    // Method to check if the temperature is correct
    boolean hasCorrectTemperature() {
        return temperature >= 85 && temperature <= 95;
    }

    // Method to check if the stirring time is correct
    boolean hasCorrectStirringTime() {
        return stirringTime >= 7 && stirringTime <= 12;
    }

    // Method to determine if the potion is successfully brewed
    boolean isPotionSuccessful() {
        return hasCorrectIngredients() && hasCorrectTemperature() && hasCorrectStirringTime();
    }

    // Method to determine if the potion failed due to temperature issues
    boolean isPotionFailureDueToOverheat() {
        return temperature > 95 || temperature < 85;
    }

    // Method to determine if the potion failed due to incorrect stirring time
    boolean isPotionFailureDueToTime() {
        return stirringTime > 15 || stirringTime < 5;
    }

    // Method to provide feedback on the brewing process
    void brewPotion() {
        if (isPotionSuccessful()) {
            System.out.println("Congratulations! You have successfully brewed the magic potion!");
        } else if (isPotionFailureDueToOverheat()) {
            System.out.println("The potion failed because the temperature was not in the correct range (85°C - 95°C).");
        } else if (isPotionFailureDueToTime()) {
            System.out.println("The potion failed because the stirring time was not in the correct range (5 - 15 minutes).");
        } else {
            System.out.println("The potion failed because the ingredients or conditions were incorrect.");
        }
    }
}
