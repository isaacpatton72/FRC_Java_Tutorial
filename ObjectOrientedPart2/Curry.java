package ObjectOrientedPart2;

class Curry {
    String name;
    String ingredients; // Using a single String to represent ingredients
    String spicinessLevel;
    String cuisineType;
    String servingTemperature;
    int preparationTime; // in minutes
    int servingSize;
    int caloriesPerServing;

    /*
     * all of the things right above me are all the characteristics that we know about a curry recipe. 
     * This lists attributes like the name of the curry, the ingredients, the spiciness level, the 
     * cuisine etc.. These are all things that we can use to describe a curry recipe. But notice how we
     * are not using the equal signs here. We are just listing the attributes that we know about the curry. 
     * This information is not specific to any one curry recipe, it is just the information that we know about
     * curry recipes in general. Now it technically would be possible to create a curry object with this information
     * hard coded in as seen below:
     */


     String nameHardCoded = "Chicken Curry";
     String ingredientsHardCoded = "yougurt, curry powder, coconut milk, cayenne, etc"; // FYI this is a single string
     String spicinessLevelHardCoded = "Medium";
     String cuisineTypeHardCoded = "Indian";
     String servingTemperatureHardCoded = "Hot";
     int preparationTimeHardCoded = 60; // in minutes
     int servingSizeHardCoded = 4;
     int caloriesPerServingHardCoded = 700;



    /*
     * this is an acceptable way to set up the class (java itself doesn't have any issues with this) but as 
     * we will see in the next lesson, by leaving the values empty we can create storage variabels that can
     * be used for general curry recipes, allowing us to create multiple curry recipes with the same class.
     * These values would techinally be able to be rewritten later using the equals sign that we learned about
     * earlier, but as you will see soon, there is a better way to do this that will lead to more readable code
     * with less confusing parts. 
     */



    //The rest of the class
}
