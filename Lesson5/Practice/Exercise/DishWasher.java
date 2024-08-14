package Lesson5.Practice.Exercise;

class DishWasher {

    //instance variables
    String brand;
    boolean isRunning = false;
    int waterConsumptionPerCycle = 0; // in gallons
    double totalEnergyUsed = 0; //a measure of the total energy used at this point


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


    // Method to print the status of the dishwasher
    void printStatus() {
        System.out.println("Dishwasher Brand: " + brand);
        System.out.println("Is Running: " + isRunning);
        System.out.println("Water Consumption: " + waterConsumptionPerCycle + " liters per cycle");
        System.out.println("Total Energy Used: " + totalEnergyUsed + " kWh");
    }

    void runFullCycle() {
        start();
        preWash(10);
        mainWash(40);
        dry(30);
        stop();
    }

}
