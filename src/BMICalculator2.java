/*
 * This program prompts the user to enter their weight in pounds and their
 * height in feet, and outputs the weight converted to kilograms, height 
 * converted to meters, the calculated BMI, and its classification as 
 * underweight, normal, overweight or obese.
 */

import java.util.*;

public class BMICalculator2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
	
        System.out.println("Enter your weight in pounds");
		
	final double lbsToKg = 0.453592;
	double weightKg = input.nextDouble() * lbsToKg; 
		
	System.out.println("Enter your height in feet");
		
	final double ftToM = 0.3048;
        double heightMeters = input.nextDouble() * ftToM; 
		
	double bodyMassIndex = weightKg / Math.pow(heightMeters, 2);

        System.out.println("Your weight converts to " + weightKg + " kilograms");
        System.out.println("Your height converts to " + heightMeters + " meters");
        System.out.println("Your BMI is " + bodyMassIndex);
        
        if (bodyMassIndex < 18.5) {
            System.out.println("You are underweight");
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25){
            System.out.println("Your weight is normal");
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
            System.out.println("You are overweight");
        } else if (bodyMassIndex > 30) {
            System.out.println("You are obese");
        }
            
    }
}
