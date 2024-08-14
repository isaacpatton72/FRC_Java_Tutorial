package Lesson4;

class Main {
    public static void main(String[] args) {

        Car myNewerFerrari = new Car("Ferrari", "812 GTS", 2023, "Red");

        Car myOlderFerrari = new Car("Ferrari", "Roma", 2021, "Red");

        System.out.println("This is a " + myNewerFerrari.color + " " + myNewerFerrari.model + " " + myNewerFerrari.brand + " Produced in " + myNewerFerrari.yearProduced);
        System.out.println("This is a " + myOlderFerrari.color + " " + myOlderFerrari.model + " " + myOlderFerrari.brand + " Produced in " + myOlderFerrari.yearProduced);
    
    


    }
}
