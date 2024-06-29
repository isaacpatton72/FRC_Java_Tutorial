package Lesson7;


class House {
    String roofColor;
    int numberOfWindows;
    String wallMaterial;
    boolean isAirConditioningOn;


    House(String DesiredRoofColor, 
          int DesiredNumberOfWindows, 
          String DesiredWallMaterial) {
            
        roofColor = DesiredRoofColor;
        numberOfWindows = DesiredNumberOfWindows;
        wallMaterial = DesiredWallMaterial;
        isAirConditioningOn = false;
    }

    void turnOnAirConditioning() {
        isAirConditioningOn = true;
    }

    void turnOffAirConditioning() {
        isAirConditioningOn = false;
    }

    void printAirConditioningStatus() {
        System.out.println("Is the air conditioning on? " + isAirConditioningOn);
    }

    void printAllHouseData() {
        System.out.println("Roof Color: " + roofColor);
        System.out.println("Number of Windows: " + numberOfWindows);
        System.out.println("Wall Material: " + wallMaterial);
        System.out.println("Is the air conditioning on? " + isAirConditioningOn);
    }
}
