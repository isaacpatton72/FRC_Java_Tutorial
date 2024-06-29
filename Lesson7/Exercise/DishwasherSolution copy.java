package Lesson7.Exercise;

class DishwasherSolution {
    String brand;
    boolean isRunning;
    int waterConsumption; // in gallons

    DishwasherSolution(String brand) {
        this.brand = brand;
        this.isRunning = false;
        this.waterConsumption = 0;
    }

    // Method to start the dishwasher
    void turnOn() {
        isRunning = true;
    }

    // Method to stop the dishwasher
    void turnOff() {
        isRunning = false;
    }

    // Method to set the water consumption of the dishwasher
    void setWaterConsumption(int waterConsumption) {
        this.waterConsumption = waterConsumption;
    }

    void preWash() {
        setWaterConsumption(3);
    }

    void mainWash() {
        setWaterConsumption(5);
    }

    void dryDishes() {
        setWaterConsumption(0);
    }




    // Method to print the status of the dishwasher
    void printStatus() {
        System.out.println("Dishwasher Brand: " + brand);
        System.out.println("Is Running: " + isRunning);
        System.out.println("Water Consumption: " + waterConsumption + " liters per cycle");
    }

    void printCleaningStatus(){
        if(isRunning){
            System.out.println("Your " + brand + "Dishwasher is cleaning the dishes using " + waterConsumption + " gallons of water per cycle");
        } else {
            System.out.println("Your " + brand + "Dishwasher is not running and is using " + waterConsumption + " gallons of water per cycle");
        }

    }


    void runCycle() {
        turnOn();
        printCleaningStatus();
        preWash();
        printCleaningStatus();
        mainWash();
        printCleaningStatus();
        dryDishes();
        printCleaningStatus();
        turnOff();
        printCleaningStatus();
    }


}
