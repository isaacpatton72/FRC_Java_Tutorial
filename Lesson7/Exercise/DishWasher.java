package Lesson7.Exercise;

class DishWasher {
    String brand;
    boolean isRunning;
    int waterConsumption; // in gallons

    DishWasher(String brand) {
        this.brand = brand;
        this.isRunning = false;
        this.waterConsumption = 0;
    }

    // Method to set the water consumption of the dishwasher
    void setWaterConsumption(int waterConsumption) {
        this.waterConsumption = waterConsumption;
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


}
