package ObjectOrientedPart3;

class House3 {
    String roofColor;
    int numberOfWindows;
    String wallMaterial;


    House3(String laterDeterminedRoofColor, int laterDeterminedNumberOfWindows, String laterDeterminedWallMaterial) {
        roofColor = laterDeterminedRoofColor;
        numberOfWindows = laterDeterminedNumberOfWindows;
        wallMaterial = laterDeterminedWallMaterial;
    }

    /*
     * This is where the real power of constructors come in.
     * Let's break down what is happening here.
     * The stuff contained in the parentheses () are called parameters, and these
     * are used to pass in values to the constructor at a later point in time
     * when we actually get around to wanting to build our house. Remember that right
     * now we are just defining the blueprint for what a house is; we haven't
     * actually built one yet. That is very important to remember because in the house2
     * example, that is essentially what is going on there. By hardcoding the values, 
     * we are essentially building a specific house right at that very moment within the
     * constructor. In the house2 example we built a house with a red roof, 5 windows, 
     * and brick walls. What we instead want to do is create a blueprint so that any house 
     * that we build in the future can use this same blueprint for what a house looks like,
     * all it has to do is send in the specifics of what it wants the house to look like, and
     * the constructor can take the blueprint and easily create the house.
     * 
     * That probably doesn't make a whole lot of sense to you yet so let's go look at a hard 
     * example of what makes using a blue print so much more powerful than hardcoding the values.
     */

}
