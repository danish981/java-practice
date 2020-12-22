package Ch_3;

import java.util.Scanner;

/**
 * Created by Developers on 6/5/2020.
 */
public class BMI {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //we will write our code here
        System.out.println("this program will calculate body mass index, enter weight and height");
        System.out.print("Enter the weight in feet : ");
        double feet = input.nextDouble();

        System.out.print("Enter inches : ");
        double inches = input.nextDouble();

        System.out.println("Enter weight in pounds : ");
        double pounds = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45_35_92_37;       //pounds in one kilogram
        final double METER_PER_INCH = 0.02_54;


        feet = Math.abs(feet);
        inches = Math.abs(inches);
        pounds = Math.abs(pounds);


        inches = (feet * 12) + inches;

        //converting in SI unites

        double meters = METER_PER_INCH * inches;
        double kilograms = KILOGRAMS_PER_POUND * pounds;

        double bmi = kilograms / Math.pow(meters, 2);

        System.out.println("Body mass index is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }


        //the weight should be in kilograms and height should be in meters, that are SI units


    }

}
