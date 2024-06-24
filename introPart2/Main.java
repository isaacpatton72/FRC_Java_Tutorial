package IntroPart2;
class Main {
    // public static void main(String[] args) {
    //     print1();
    // }

    // public static void print1() {
    //     System.out.println("The first print statement");
    //     print2();
    // }

    // public static void print2() {
    //     System.out.println("The second print statement");
    //     print3();
    // }

    // public static void print3() {
    //     System.out.println("The third and final print statement");
    // }



    public static void main(String[] args) {

        /*
         * Though you shouldn't typically write code with all the white spaces seen below
         * it is important to know that for the most part the only thing that java cares about
         * is the semicolons and the curly braces. The white spaces are for readability and
         * are not necessary for the code to run. At least in the majority of cases as we will see.
         * This is also why java has the semicolons, is so that you can not worry about tabs and spacing
         * and can instead use that space for making your code more readable.
         */


        /*
         * this will be the default print statment for use to compare to the others
         */
        System.out.println("print statement number ___");


        /*
         * In this statement you can see we added space around the quotation marks yet
         * our output is still the same. This is because java does not care about white space
         */
        System.out.println(    "print statement number 1" );



        /*
         * in this case we see that one of the few times java cares about white space is when
         * it is inside the quotation marks. This is because the white space is part of the string
         * and not just for readability. We are actually altering the data that is being printed out.
         */
        System.out.println("print   statement        number   2  ");


        /*
         * in this case the beginning is tabbed over to the right yet the output looks normal.
         */
                        System.out.println("print statement number 3");


        /*
         * in this case we see that the system part of the word is split with space in between the word 
         * system and out, yet the output remains the same.
         */
        System       .out.println("print statement number 4");
        

        /*
         * in this case we see that the print statement is split up into two lines yet the output is still the same.
         * This is the most prevelant case that you will see in code later in this series as it makes long multi-line
         * pieces of code more readable.
         */
        System.out.println(
            "print statement number 4");
            
            


        /*
         * this is one of the few cases where white space does matter. In this case we are sperating the keywords up 
         * so that java does not recognize it as a keyword. This is why we get an error when we run this code.
         * Outside of the following case and case 2, any combination of white space is typically fine at least in 
         * terms of the code output being consistent.
         */
        // System.out.prin     tln("print statement number 5");
    }
}