/*
 * Lewis White
 * March 18, 2019
 * This program will display many types of unit conversions, then take the input and convert it
 */

package metricconversion;

import java.util.Scanner;

/**
 *
 * @author lewhi7273
 */
public class MetricConversion {
    
    /**
     * Pre: Take user input in inches
     * Post: Display number of inches in terms of centimeters
     */
    public static void inchesToCentimeters(double choice){
        double converted = choice * 2.54;
       System.out.println(+choice+ " inches equals " + converted + " centimeters");
    }
    /**
     * Pre: Take user input in feet
     * Post: Display number of feet in terms of centimeters
     */
    public static void feetToCentimeters(double choice){
        double converted = choice * 30;
       System.out.println(+choice+ " feet equals " + converted + " centimeters");
    }
    /**
     * Pre: Take user input in yards
     * Post: Display number of yards in terms of meters
     */
    public static void yardsToMeters(double choice){
        double converted = choice * 0.91;
       System.out.println(+choice+ " yards equals " + converted + " meters");
    }
    /**
     * Pre: Take user input in miles
     * Post: Display number of miles in terms of kilometers
     */
    public static void milesToKilometers(double choice){
        double converted = choice * 1.6;
       System.out.println(+choice+ " miles equals " + converted + " kilometers");
    }
    /**
     * Pre: Take user input in centimeters
     * Post: Display number of centimeters in terms of inches
     */
    public static void centimetersToInches(double choice){
        double converted = choice / 2.54;
       System.out.println(+choice+ " centimeters equals " + converted + " inches");
    }
    /**
     * Pre: Take user input in centimeters
     * Post: Display number of centimeters in terms of feet
     */
    public static void centimetersToFeet(double choice){
        double converted = choice / 30;
       System.out.println(+choice+ " centimeters equals " + converted + " feet");
    }
    /**
     * Pre: Take user input in meters
     * Post: Display number of meters in terms of yards
     */
    public static void metersToYards(double choice){
        double converted = choice / 0.91;
       System.out.println(+choice+ " meters equals " + converted + " yards");
    }
    /**
     * Pre: Take user input in kilometers
     * Post: Display number of kilometers in terms of miles
     */
    public static void kilometersToMiles(double choice){
        double converted = choice / 1.6;
       System.out.println(+choice+ " kilometers equals " + converted + " miles");
    }
    
    /**
     * Pre: This main method will gather the users input and selection
     * Post: This will call the required method and print the result
     */
    public static void main(String[] args) {
        double choice, choice2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
           choice = input.nextDouble();
           //choice 2 will pick type of conversion
        System.out.println("Convert :");
        System.out.println("1.Inches to Centimeters                         5.Centimeters to Inches");
        System.out.println("2.Feet to Centimeters                           6.Centimeters to Feet");
        System.out.println("3.Yards to Meters                               7.Meters to Yards");
        System.out.println("4.Miles to Kilometers                           8.Kilometers to Miles");
        System.out.println("Enter your choice: ");
            choice2 = input.nextInt();
            //call the chosen method
            if (choice2 == 1){
                inchesToCentimeters(choice);
               input.close();
            }else if(choice2 == 2){
                feetToCentimeters(choice);
                input.close();
            }else if (choice2 == 3){
                yardsToMeters(choice);
                input.close();
            }else if (choice2 == 4){
                milesToKilometers(choice);
                input.close();
            }else if (choice2 == 5){
                centimetersToInches(choice);
                input.close();
            }else if (choice2 == 6){
                centimetersToFeet(choice);
                input.close();
            }else if (choice2 == 7){
                metersToYards(choice);
                input.close();
            }else if (choice2 == 8){
                kilometersToMiles(choice);
                input.close();
            }else{
                System.out.println("Please try again, and enter a selection between 1 and 8.");
     }
    }
}