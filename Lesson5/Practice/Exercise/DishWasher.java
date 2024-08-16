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

    void printStatus() {
        System.out.println("Dishwasher Brand: " + brand);
        System.out.println("Is running: " + isRunning );
        System.out.println("Current Water Consumption: " + waterConsumptionPerCycle + " gallons per cycle");
        System.out.println("Total Energy Used: " + totalEnergyUsed + " kWh");
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

    void runFullCycle() {
        preWash(10);
        mainWash(40);
        dry(30);
    }





}
