package Lesson6;

public class OOP_Example {
    class HardCodedHouse1 {
        String roofColor;
        int numberOfWindows;
        String wallMaterial;
    
    
        HardCodedHouse1() {
            roofColor = "Red";
            numberOfWindows = 5;
            wallMaterial = "brick";
        }
    }

    class HardCodedHouse2 {
        String roofColor;
        int numberOfWindows;
        String wallMaterial;
    
    
        HardCodedHouse2() {
            roofColor = "Blue";
            numberOfWindows = 3;
            wallMaterial = "wood";
        }
    }

    class HardCodedHouse3 {
        String roofColor;
        int numberOfWindows;
        String wallMaterial;
    
    
        HardCodedHouse3() {
            roofColor = "Green";
            numberOfWindows = 7;
            wallMaterial = "stone";
        }
    }

    class HardCodedHouse4 {
        String roofColor;
        int numberOfWindows;
        String wallMaterial;
    
    
        HardCodedHouse4() {
            roofColor = "Yellow";
            numberOfWindows = 2;
            wallMaterial = "stucco";
        }
    }


    public static void main(String[] args) {
        OOP_Example example = new OOP_Example();
        HardCodedHouse1 hardCodedHouse1 = example.new HardCodedHouse1();
        HardCodedHouse2 hardCodedHouse2 = example.new HardCodedHouse2();
        HardCodedHouse3 hardCodedHouse3 = example.new HardCodedHouse3();
        HardCodedHouse4 hardCodedHouse4 = example.new HardCodedHouse4();

        /*
         * up until this point we have used around 50-60 lines of code to create 4 house objects. 
         * now we are going to do the exact same thing using object oriented programming to simplify
         * it down to 16 lines in total by using the blue print instead of hard coding values. 
         */


        House3 objectOrientedHouse1 = new House3("Red", 5, "brick");
        House3 objectOrientedHouse2 = new House3("Blue", 3, "wood");
        House3 objectOrientedHouse3 = new House3("Green", 7, "stone");
        House3 objectOrientedHouse4 = new House3("Yellow", 2, "stucco");

        //Tada!
    }
}
