package Lesson5;

public class Main {

    public static void main(String[] args) {

        GenericHouse mFirstHouse = new GenericHouse("orange", 5, "brick");
        GenericHouse mSecondHouse = new GenericHouse("blue", 10, "wood");
        GenericHouse mThirdHosue = new GenericHouse("magenta", 15, "stone");


        System.out.println(mFirstHouse.roofColor);
        System.out.println(mSecondHouse.roofColor);
        System.out.println(mThirdHosue.roofColor);
       
        

    }



}
