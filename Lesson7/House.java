package Lesson7;


class House {
    String roofColor;
    int numberOfWindows;
    String wallMaterial;
    boolean isAirConditioningOn;

    boolean areLightsOn;
    boolean isWaterRunning;


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






    void turnOnLights() {
        areLightsOn = true;
    }

    void turnOffLights() {
        areLightsOn = false;
    }

    void printLightsStatus() {
        System.out.println("Are the lights on? " + areLightsOn);
    }

    void turnOnWater() {
        isWaterRunning = true;
    }

    void turnOffWater() {
        isWaterRunning = false;
    }

    void printWaterStatus() {
        System.out.println("Is the heating on? " + isWaterRunning);
    }

    void saveMoney() {
        turnOffWater();
        turnOffAirConditioning();
        turnOffLights();
    }

    void printAllHouseData2() {
        System.out.println("Roof Color: " + roofColor);
        System.out.println("Number of Windows: " + numberOfWindows);
        System.out.println("Wall Material: " + wallMaterial);
        System.out.println("Is the air conditioning on? " + isAirConditioningOn);
        System.out.println("Are the lights on? " + areLightsOn);
        System.out.println("Is the heating on? " + isWaterRunning);
    }


    void addWindows(int windowsToAdd) {
        numberOfWindows += windowsToAdd;
    }

    void repaintRoof(String newRoofColor) {
        roofColor = newRoofColor;
    }



}
