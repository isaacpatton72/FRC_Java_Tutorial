package Lesson5;

class Car {

        //instance variables
        String brand = "No brand";
        String model = "Unkown";
        int yearProduced = 0;
        String color = "No color";
        double speed = 0;
        boolean isCarOn = false;
        

        //constructor
        Car(String brandToAssign, String modelToAssign, int yearProducedToAssign, String colorToAssign) {
            brand = brandToAssign;
            model = modelToAssign;
            yearProduced = yearProducedToAssign;
            color = colorToAssign;
        }


        void startEngine() {
            isCarOn = true;
            System.out.println("Your car is now running");
        }

        void stopEngine() {
            isCarOn = false;
            System.out.println("Your car is now off");
        }

        void accelerate() {
            speed += 10;
        }

        void brake() {
            speed -= 10;
        }

        void setSpeed(double speedToSet) {
            speed = speedToSet;
        }

        void stopCar() {
            setSpeed(0);
        }

        void printInformation() {
            System.out.println("This is a " + color 
                + " " + model + 
                " " + brand + 
                " Produced in " + yearProduced + 
                "... isCarOn: "  + isCarOn 
                + "... the car is going " + speed + " mph");
        }










}
