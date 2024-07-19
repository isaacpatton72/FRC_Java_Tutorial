package Lesson6;

class Calculator {
    
    //instance variables 


    //constructor


    double calculateArea(double base1, double base2, double height) {
        return ((base1 + base2) / 2) * height;
    }


    void calculatePerimterAndPrint(double sideA, double sideB, double base1, double base2) {
        double perimeter = sideA + sideB + base1 + base2;
        System.out.println("the perimeter of this trapezoid is: " + perimeter);
    }


    

}
