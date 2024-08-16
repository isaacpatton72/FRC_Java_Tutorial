package Lesson5;

class Car {

        //instance variables
        String brand = "No brand";
        String model = "Unkown";
        int yearProduced = 0;
        String color = "No color";

        //constructor
        Car(String brandToAssign, String modelToAssign, int yearProducedToAssign, String colorToAssign) {
            brand = brandToAssign;
            model = modelToAssign;
            yearProduced = yearProducedToAssign;
            color = colorToAssign;
        }

        // the drive method
        void drive() {
            System.out.println("The car is now driving!");
        }

        void paintPurple() {
            color = "purple";
        }

        void remodelToBuggee() {
            model = "Beetle";
            yearProduced = 1999;
            brand = "VolksWaggen";
            color = "god awful yellow";
            printState();
        }

        void printState() {
            System.out.println("This is a " + color + " " + model + " " + brand + " Produced in " + yearProduced);
        }

        String returnState() { 
            return "This is a " + color + " " + model + " " + brand + " Produced in " + yearProduced;
        }



        void printOutString(String stringToPrint, int intToPrint) {
            System.out.println(stringToPrint  + intToPrint);
        }

        
        


 
}
