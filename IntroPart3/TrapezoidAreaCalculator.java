package IntroPart3;

public class TrapezoidAreaCalculator {
    public static void main(String[] args) {
        double a = 5; // Length of the first parallel side
        double b = 7; // Length of the second parallel side
        double h = 4; // Height

        // Calculate the area of the trapezoid
        double area = (a + b) * h / 2;

        System.out.println("The area of the trapezoid is: " + area);
    }
}