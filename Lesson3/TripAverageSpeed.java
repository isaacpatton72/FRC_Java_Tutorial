package Lesson3;

class TripAverageSpeed {


    /*
     * Problem Statement:
        You went on a trip that was divided into two parts. In the first part, you traveled 60 miles at a certain speed. 
        In the second part, which was also 60 miles, you traveled 20% faster than the first part. Calculate the overall 
        average speed.

        Logical Steps:
        Calculate the speed for the second part of the trip, knowing it's 20% faster than the first part.
        Calculate the time taken for each part of the trip using the speed and distance (Time = Distance / Speed).
        Calculate the total time for the trip by adding the time for both parts.
        Calculate the overall average speed using the total distance and total time (Speed = Total Distance / Total Time).

     */
    public static void main(String[] args) {
        double firstPartSpeed = 60; // Speed for the first part of the trip in miles per hour
        double firstPartDistance = 60; // Distance for the first part of the trip in miles
        
        // Step 1: Calculate the speed for the second part
        double secondPartSpeed = firstPartSpeed * 1.2;
        


        // Step 2: Calculate the time taken for each part
        //Hint: Time = Distance / Speed
        double firstPartTime = firstPartDistance / firstPartSpeed; // Time = Distance / Speed
        double secondPartTime = firstPartDistance / secondPartSpeed; // Same distance for the second part
        
        // Step 3: Calculate the total time
        double totalTime = firstPartTime + secondPartTime;
        
        // Step 4: Calculate the overall average speed
        double totalDistance = firstPartDistance * 2; // Total distance for both parts
        double averageSpeed = totalDistance / totalTime;
        
        System.out.println("The overall average speed for the trip is: " + averageSpeed + " miles per hour.");
    }
}