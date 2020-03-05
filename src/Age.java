/*
 * (Decription to be added)
 */

import java.util.*;
import java.time.*;

public class Age {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your date of birth in the format YYYY-MM-DD");
        
        String input = s.nextLine();
       
        LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate =  LocalDate.now();
        
        Period.between(birthDate, currentDate);
        int age = Period.between(birthDate, currentDate).getYears();
        
        System.out.println("You are " + age + " years old");
        
    }
}
