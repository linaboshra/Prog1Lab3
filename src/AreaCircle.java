/*
 * This program calculates the area of a circle, based on a radius given by
 * the user. If the input is negative, or zero, the program warns the user of 
 * the mistake.
 */

import java.util.*;

public class AreaCircle {
    public static void main(String[] args) {
        
        System.out.println("Enter the radius of the circle");
        
        Scanner input = new Scanner(System.in);

        int radius = input.nextInt();
        final double PI = Math.PI;

        if (radius > 0) {
            System.out.println("The area of the circle is " + (PI * radius * radius));
        } else {
            System.out.println("The value of the radius cannot be negative or zero");
        }
    }
}
