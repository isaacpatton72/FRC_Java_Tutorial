package Lesson5;

class Main {

    public static void main(String[] args) {

        Car myNewerFerrari = new Car("Ferrari", "812 GTS", 2023, "Red");
        Car myOlderFerrari = new Car("Ferrari", "Roma", 2021, "Red");
        
        myNewerFerrari.printInformation();
        myOlderFerrari.printInformation();

        myNewerFerrari.setSpeed(50);

        myNewerFerrari.printInformation();
        myOlderFerrari.printInformation();

        myNewerFerrari.stopCar();
        
        myNewerFerrari.printInformation();
        myOlderFerrari.printInformation();







    }


}
