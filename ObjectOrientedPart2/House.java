package ObjectOrientedPart2;

class House {
    String roofColor;
    int numberOfWindows;
    String wallMaterial;


    /*
     * In this class, we have defined a House object with three attributes: roofColor, 
     * numberOfWindows, and wallMaterial. If you wanted a special house with a red roof, 
     * 5 windows, and brick walls, you could create a House object like this:
     */

     String roofColorHouse1 = "Red";
     int numberOfWindowsHouse1 = 5;
     String wallMaterialHouse1 = "Brick";

     /*
      * and now if you wanted to create another house with a blue roof, 3 windows, and
      * wood walls, you could create another House object like this:
      */

        String roofColorHouse2 = "Blue";
        int numberOfWindowsHouse2 = 3;
        String wallMaterialHouse2 = "Wood";

    /*
     * But now what is the plan if you want to create an entire neighborhood of houses?
     * Do you really want to write out all these variable names for all maybe one thousand
     * houses in a neighboord hood? Going through and writing out all the variable names for
     * each house would be a nightmare. Having to write out roofColorHouse399 and counting would
     * actually take forever. But instead by using the blueprint on lines 4-6, we dont have to 
     * write out all the variable names for each house. We can just create a new house object
     * using somthing called a constructor which we will talk about in the next lesson. 
     */


}
