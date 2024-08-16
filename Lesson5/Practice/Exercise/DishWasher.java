package Lesson5.Practice.Exercise;

public class DishWasher {
    
    //instance variables
    String brand;
    boolean isRunning = false;
    int waterConsumptionPerCycle = 0;
    double totalEnergyUsed = 0;

    //constructor
    DishWasher(String brand) {
        this.brand = brand;
    }

    void start() {
        totalEnergyUsed = 0;
        isRunning = true;
    }

    void stop() {
        isRunning = false;
    }

    double calculateEnergyUsed(double timeInMinutes) {
        return (waterConsumptionPerCycle * 1.34) + 0.15307107 * timeInMinutes;
    }

    void preWash(double timeRunning) {
        waterConsumptionPerCycle = 3;
        totalEnergyUsed += calculateEnergyUsed(timeRunning);
    }

    void mainWash(double timeRunning) {
        waterConsumptionPerCycle = 5;
        totalEnergyUsed += calculateEnergyUsed(timeRunning);
    }

    void dry(double timeRunning) {
        waterConsumptionPerCycle = 0;
        totalEnergyUsed += calculateEnergyUsed(timeRunning);
    }





}
