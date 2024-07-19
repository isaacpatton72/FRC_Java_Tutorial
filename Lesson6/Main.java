package Lesson6;

public class Main {
    
    public static void main(String[] args) {

        Calculator myCalaculator = new Calculator();
        System.out.println(myCalaculator.calculateArea(5, 5, 3));
        System.out.println(myCalaculator.calculateArea(2, 4, 3));
        System.out.println(myCalaculator.calculateArea(7, 9, 3));


        WorseCalculator myWorseCalculator = new WorseCalculator(5, 5, 3, 3, 2);
        System.out.println(myWorseCalculator.calculateArea());
        WorseCalculator myWorseCalculator2 = new WorseCalculator(2, 4, 3, 3, 2);
        System.out.println(myWorseCalculator2.calculateArea());
        WorseCalculator myWorseCalculator3 = new WorseCalculator(7, 9, 3, 3, 2);
        System.out.println(myWorseCalculator3.calculateArea());

        
        
    }
}
