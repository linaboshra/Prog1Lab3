/*
* This program provides the user a menu with 5 options of conversion operation.
* Based on the user selection, the program prompts the user to enter a value
* and converts it.
*/


import java.util.*;

public class Conversions {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
	
        System.out.println("Choose one of the following conversion operations:");
        System.out.println("(1) Meters to Feet");
        System.out.println("(2) CAD to USD");
        System.out.println("(3) Celsius to Fahrenheit");
        System.out.println("(4) Liters to Gallons");
        System.out.println("(5) Kilometers to Miles");
        
        int choice = input.nextInt();
        
        switch (choice){
            case 1:
                System.out.println("Enter the value of distance in meters you want to convert");
                double meters = input.nextDouble();
                final double metersToFeet = 0.3048;
                System.out.println(meters + " meters equals " + (meters * metersToFeet) + " feet");
                break;
            case 2:
                System.out.println("Enter the value of Canadian dollars you want to convert");
                double cad = input.nextDouble();
                final double cadToUSD = 0.3048;
                System.out.println(cad + " Canadian dollars equals " + (cad * cadToUSD) + " US dollars");
                break;
            case 3:
                System.out.println("Enter the temperature in Celsius you want to convert");
                double degreeC = input.nextDouble();
                double degreeF = (degreeC * (9/5)) + 32;
                System.out.println(degreeC + " degrees Celsius equals " + degreeF + " degrees Fahrenheit");
                break;
            case 4:
              System.out.println("Enter the value of volume in liters you want to convert");
                double liters = input.nextDouble();
                final double litersToGallons = 0.264172;
                System.out.println(liters + " liters equals " + (liters * litersToGallons) + " gallons");
                break;  
            case 5:
                System.out.println("Enter the value of distance in kilometers you want to convert");
                double kilometers = input.nextDouble();
                final double kilometersToMiles = 0.621371;
                System.out.println(kilometers + " kilometers equals " + (kilometers * kilometersToMiles) + " miles");
                break;
        }
    }
}
