package exer2BMI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input height in feet & inches, and weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in feet(ft.): ");
        double feet = input.nextDouble(); // Changed from int to double

        System.out.print("Enter height in inches(in.): ");
        double inches = input.nextDouble(); // Changed from int to double to match precision

        // 2. Convert to meters and kilograms
        double totalInches = (feet * 12) + inches; // Changed from int to double
        double heightInMeters = totalInches * 0.0254;
        double weightInKilograms = weightInPounds / 2.2;

        // 3. Compute BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display the calculated BMI
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // 4. Output health risk using if statements
        System.out.print("Health assessment: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal weight");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Hulk");
        }

        input.close();
    }
}



