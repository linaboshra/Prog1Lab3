/*
 * This program  prompts the user for the current temperature in Celsius and 
 * outputs different messages if it is above or below zero.
 */

import java.util.*;

public class Temperature {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
	
        System.out.println("Enter the temperature in Celsius");
        
        int temperature = input.nextInt();
        
        String output = (temperature > 0) ? "The temperature is above zero" : "The temperature is below zero";
        System.out.println(output);
    }
}
