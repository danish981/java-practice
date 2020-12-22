package Ch_3;

import java.util.Scanner;

public class LinearEquation2x2 {


    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a : ");
        float a = input.nextInt();
        System.out.print("Enter b : ");
        float b = input.nextInt();
        System.out.print("Enter c : ");
        float c = input.nextInt();
        System.out.print("Enter d : ");
        float d = input.nextInt();
        System.out.print("Enter e : ");
        float e = input.nextInt();
        System.out.print("Enter f : ");
        float f = input.nextInt();


        float denominator = (a * d) - (b * c);

        if (denominator == 0) {
            System.out.println("the equation has no solution");
        } else {
            float firstRoot = ((e * d) - (b * f)) / denominator;
            float secondRoot = ((a * f) - (e * c)) / denominator;
            System.out.println("first root is " + firstRoot);
            System.out.println("second root is " + secondRoot);

        }

    }


}
