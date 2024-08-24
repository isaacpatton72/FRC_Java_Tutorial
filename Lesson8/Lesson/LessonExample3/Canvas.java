package Lesson8.Lesson.LessonExample3;

public class Canvas {
    private boolean hasPaintBrush = false;
    
    private String drawingSurface;

    public void prepareEverything() {
        prepareCanvas();
        gatherPaintBrush();
    }

    // Public method to prepare the canvas
    public void prepareCanvas() {
        System.out.println("Preparing canvas...");
        drawingSurface = 
        """
            * * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * * *
        """; 
    }

    // Private method to initialize the canvas (SHOULD BE PRIVATE)
    public void gatherPaintBrush() {
        hasPaintBrush = true;
    }

    // Public method to draw a shape
    public void drawShape() {
        if (hasPaintBrush && drawingSurface != null) {
            drawingSurface = 
            """
                O O O O O
                O * * * O
                O * * * O
                O * * * O
                O O O O O
            """;
            printCanvas();
        } else {
            throw new IllegalStateException("All materiels mut be prepared first");
        }
    }

    void printCanvas() {
        System.out.println(drawingSurface);
    }
}
