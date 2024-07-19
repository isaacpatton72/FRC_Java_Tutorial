package Lesson6;

class WorseCalculator {
    
    //instance variables 
    double base1;
    double base2;
    double height;
    double sideA;
    double sideB;


    //constructor
    WorseCalculator(double base1, double base2, double height, double sideA, double sideB) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }


    double calculateArea() {
        return ((base1 + base2) / 2) * height;
    }


    void calculatePerimterAndPrint() {
        double perimeter = sideA + sideB + base1 + base2;
        System.out.println("the perimeter of this trapezoid is: " + perimeter);
    }


    
}
