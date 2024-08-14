package Lesson4.Exercise;

public class ExerciseMain {
    public static void main(String[] args) {
        Apple grannySmith = new Apple("GrannySmith", "green", 4, 8);
        Apple pinkLadySlipper = new Apple("Pink Lady Slipper", "pink", 6, 4);
        Apple honeyCrisp = new Apple("Honey crisp", "red", 9, 2);

        // A grannysmith apple is green, has a sweetness of 4, and a tartness of 8
        System.out.println("A " + grannySmith.name + " apple is " + grannySmith.color + ", has a sweetness of " + grannySmith.sweetness + ", and a tartness of " + grannySmith.tartness);
        System.out.println("A " + pinkLadySlipper.name + " apple is " + pinkLadySlipper.color + ", has a sweetness of " + pinkLadySlipper.sweetness + ", and a tartness of " + pinkLadySlipper.tartness);
        System.out.println("A " + honeyCrisp.name + " apple is " + honeyCrisp.color + ", has a sweetness of " + honeyCrisp.sweetness + ", and a tartness of " + honeyCrisp.tartness);
    }
}
