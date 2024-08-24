package Lesson8.Lesson.LessonExample3;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        Canvas myCanvas = new Canvas();

        // Correct usage: properly initialize and then draw
        myCanvas.prepareEverything();
        myCanvas.drawShape();

        // Incorrect usage: calling initializeCanvas directly
        // Uncomment the following line to see what happens if initializeCanvas() is called outside its intended context
        myCanvas.prepareCanvas(); // This will throw an exception if made public and called incorrectly
        myCanvas.drawShape();

    }
}
