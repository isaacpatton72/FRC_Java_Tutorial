package ObjectOrientedPart4;

public class Main {
    
    public static void main(String[] args) {
        House myHouse = new House("Red", 5, "Brick");
        System.out.println("Is the air conditioning on? " + myHouse.isAirConditioningOn);

        myHouse.turnOnAirConditioning();
        System.out.println("Is the air conditioning on? " + myHouse.isAirConditioningOn);

        myHouse.turnOffAirConditioning();
        System.out.println("Is the air conditioning on? " + myHouse.isAirConditioningOn);





        // myHouse.turnOffAirConditioning();
        // System.out.println("Is the air conditioning on? " + myHouse.isAirConditioningOn);

        myHouse.printAirConditioningStatus();





        myHouse.printAllHouseData();


    }
}
