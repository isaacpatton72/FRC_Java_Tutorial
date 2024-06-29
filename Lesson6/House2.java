package Lesson6;

class House2 {
    String roofColor;
    int numberOfWindows;
    String wallMaterial;

    /* 
    * The first thing that we can do is give definitions to the attributes.
    * Another term you will often hear for this is initializing the variables.
    * This is different from declaring a variable because when you declare a
    * variable, you are just saying that it exists but doesn't neccesarily store a 
    * value. When you initialize a variable, you are giving it a concrete value. 
    * Note that you will have to comment out the empty constructor up above
    * in order to make java happy. I will explain why in a moment. 
    */
    
    House2() {
        roofColor = "Red";
        numberOfWindows = 5;
        wallMaterial = "Brick";
    }
}
