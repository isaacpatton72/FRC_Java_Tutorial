package Lesson6;

public class Main {
    

    /*
     * remember how I was talking about how instead of creating a house
     * in the constructor, we could pass in the values that we want to
     * use to create the house at a later point in time. This is that 
     * later point in time. Here in the main method we are going to send
     * in the data to our blue print of what our house should look like.
     */

    public static void main(String[] args) {
        
        //on the line below me we are going to create our new house
        House3 house = new House3("blue", 10, "wood");

        int anExampleInteger = 5;

        /*
         * this is a little bit of a loaded statement so let's break it down bit by bit.
         * You know how java already has a bunch of variable types like integers, strings,
         * doubles, and booleans? Well, the purpose of creating our house blue print is so
         * that we can create our own house variables. Well, wait a minute, what exactly does 
         * that mean. Let's think about this for a second. When you create a variable, you are
         * essentially creating a box that can store a value. So when you create an integer, you
         * are creating a box that can store a whole number. When you create a string, you are 
         * creating a box that can store a sequence of characters. When you create a house, you
         * are creating a box that can store everything related to what a house is. This box
         * that stores everything that pertains to what a house is, is called an object. Specifically
         * in this case, it is called a house object. The beauty of this is that java can create
         * these boxes for us very easily and is where all the power of object oriented programming
         * and blue prints comes in. 
         * 
         * In line 17, the first word House3, is specifying the type of box that we want to create. In this
         * case we want to create a box that stores everything in the hosue3 class. The second word house is
         * just the name of the box, or what we want to call the box. So far this is the same as how we would
         * create a string or an integer, specifying the type, and then the name of the variable. Then we are 
         * introduced to this "new" keyword. This is a special keyword in java that tells the computer that we
         * want to create a new box. The next part, the - House3("blue", 10, "wood"); - part is actually something
         * we have seen before. This is the constructor that we created in the house3 class. Notice how it has the
         * exact same name and types of values to pass into it as the constructor in the House3 class? 
         * That is not a coincidence. When we use the new keyword, we are telling java that we want to create a new 
         * box of the type House3, and we want to use the constructor that we defined in the House3 class to create
         * the box. Remember the analagy for the constructor that I used. It was like a construction company that
         * takes in the blue print and creates the house. Well, that construction company is finally being given
         * that blue print in the form of the "blue", 10, "wood" arguments that we are passing into the constructor.
         * And now that it finally has what it needs to build the house, the constuction company is able to, 
         * build a house. And that's exactly what it does. It builds the house and stores it in our box that we 
         * named house.
         * 
         */

        String secondHouseRoofColor = "red";
        int secondHouseNumberOfWindows = 2;
        String secondHouseWallMaterial = "brick";
        House3 ourSecondHouse = new House3(secondHouseRoofColor, secondHouseNumberOfWindows, secondHouseWallMaterial);

        /*
         * In the line above me, we are creating a second house object this time just passing in the values
         * after they have been defined. This does the exact same as the previous section of code but just
         * shows you another way of passing in information to the constructor. In the previous example I just
         * created new values in line, but it is also possible to pass in variables that have already been defined.
         * as seen by the predefined variables on lines 55 through 57. 
         */


        /*
         * The real power in all of this comes in the following statement where java is able to 
         * codense all the information in a single class down into a box where we can easily access
         * all the information. 
         */

         System.out.println(ourSecondHouse.wallMaterial);

        /*
        * I will explain more of the syntax of how the period works in later lessons but for now know 
        * it is java's way of accessing the information stored in the box. In this case we are accessing
        * the information stored in the box that we named ourSecondHouse and we are specifically asking
        * for the wallMaterial attribute. When we created those attributes in the house3 class like the 
        * wallMaterial or the roof color attribute, we were telling java that when at some point that we would set 
        * up a box, these values need to be stored in that box so that they can be easily accessible to us. 
        * And if you are wondering how were the strings and integers that we learned about in the first couple 
        * of lessons different from what we are doing now, it is because we are defining these variables in 
        * a class file rather than in a main method. Classes are specifically set up in this way so that we can
        * easily create boxes that store all the information that we need related to a topic. 
        */

        /*
         * The last thing I want to explain within this lesson is how java creates unique boxes for each 
         * object/house that we create. Let's take a look at this in action.
         */

         System.out.println(house.wallMaterial);
         System.out.println(ourSecondHouse.wallMaterial);


        /*
         * if you'll notice, when we run the program to print out the wallMaterial attribute of
         * both the house and the ourSecondHouse objects, we get two different values. This is because
         * java will create different boxes for each object that we create. This is very important because
         * it means that even though both "house" and "ourSecondHouse" are both House3 objects, they are 
         * not storing their information in the House3 class file, they are storing it in their own box. 
         * This means that anything that we do to the house object will not affect the ourSecondHouse object
         * because all the information about each of our houses is stored in their own box. This is extremely
         * important because it gives us a way to easily shove a ton of code into a single box and then be able
         * to create as many of those boxes as we want, all with unique information, without having to write 
         * a unique class for each different house.
         */

        
    }
}
