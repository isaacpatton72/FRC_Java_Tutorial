package Lesson4;

class Car {
    
    //step 1
        //instance variables
        String brand = "No brand";
        String model = "Unkown";
        int yearProduced = 0;
        String color = "No color";

    //step 2
        //constructor
        Car(String brandToAssign, String modelToAssign, int yearProducedToAssign, String colorToAssign) {
            brand = brandToAssign;
            model = modelToAssign;
            yearProduced = yearProducedToAssign;
            color = colorToAssign;
        }



        Car() {
        }




}
