package Lesson5.Practice.Exercise;

public class ExerciseMain {
    public static void main(String[] args) {
        Apple grannySmith = new Apple("GrannySmith", "Green", 4, 8);
        Apple pinkLadySlipper = new Apple("PinkLadySlipper", "Pink", 6, 4);
        Apple honeyCrisp = new Apple("HoneyCrisp", "Red", 8, 2);

        System.out.println("A " + grannySmith.name + " apple is " + grannySmith.color + ", has a sweetness of " + grannySmith.sweetness + ", and a tartness of " + grannySmith.tartness);
        System.out.println("A " + pinkLadySlipper.name + " apple is " + pinkLadySlipper.color + ", has a sweetness of " + pinkLadySlipper.sweetness + ", and a tartness of " + pinkLadySlipper.tartness);
        System.out.println("A " + honeyCrisp.name + " apple is " + honeyCrisp.color + ", has a sweetness of " + honeyCrisp.sweetness + ", and a tartness of " + honeyCrisp.tartness);
    }
}
