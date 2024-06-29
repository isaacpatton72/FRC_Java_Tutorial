package Lesson5;

class Recipe {

    //attributes list (also known as instance fields or member variables)
    String name;
    String ingredients; // Using a single String to represent ingredients
    String spicinessLevel;
    String cuisineType;
    String servingTemperature;
    int preparationTime; // in minutes
    int servingSize;
    int caloriesPerServing;

    /*
     * The first thing to notice here is that there is no main method in this file. Looking at every other 
     * file that we have written thus far, there has been a main method in every single one of them that 
     * has started the code waterfall, triggering all the code to run. But in this case, there is no main
     * method. This is because this file is not meant to be run on its own. This file is meant to be used
     * as a blueprint for creating recipes and the first part of that blueprint is the list of attributes. 
     * 
     * 
     * all the things in the list up above are characteristics that we know about a general recipe. 
     * This lists attributes like the name of the recipe, the ingredients, the spiciness level, the 
     * cuisine etc.. These are all things that we can use to describe a general recipe. But notice how we
     * are not using the equal signs here. We are just listing the attributes that we know about a general recipe. 
     * This information is not specific to any one recipe, it is just the information that we know about
     * recipes in general. Now it technically would be possible to create a curry recipe with this information
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
     * The issue with doing something like this is that this recipe is hard coded to be a curry recipe,
     * but what if we wanted to make a different recipe? We would have to create a new class for every
     * single recipe that we wanted to make. But we have all the attributes for what a recipe is in this class.
     * the name of the dish, the ingredients, the spiciness level, and everything else that describes what a 
     * recipe is. So what if instead we were to leave all the attributes blank and then fill them in later on?
     * This would let us create a new recipe with the same blueprint that we have here without having to write lines
     * 33-40 over and over again for each new recipe we want to make. This is the power of classes and objects. 
     * We can create a blueprint for what an object is and then create as many objects as we want from that blueprint,
     * each with their own unique characteristics but all with the same blueprint. Lets take a look at another example. 
     */



    //The rest of the class which we will get to later
}
