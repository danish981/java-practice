package Ch_3;


import java.util.Scanner;

// we will learn how to solve quadratic equation
public class QuadraticEquation {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter three constants in quadratic equation a, b c");

        System.out.println("Enter a : ");
        double a = input.nextDouble();

        System.out.println("Enter b : ");
        double b = input.nextDouble();

        System.out.println("Enter c : ");
        double c = input.nextDouble();


        double disc = calculateDisc(a, b, c);
        if (disc > 0) {     //the equation has two real roots
            System.out.println("the equation has two real roots");
            double rootOne = ((-b) - (Math.sqrt(calculateDisc(a, b, c)))) / (2.0 * a);

            double rootTwo = ((-b) + (Math.sqrt(calculateDisc(a, b, c)))) / (2.0 * a);


            System.out.println("first root is " + rootOne);
            System.out.println("second root is " + rootTwo);
        } else if (disc == 0) {     //the equation has one real root
            System.out.println("this equation has one real root");
            double singleRoot = (-b) / (2.0 * a);
            System.out.println("the root is " + singleRoot);
        } else {
            System.out.println("the equation has no real roots");
        }


    }


    private static double calculateDisc(double a, double b, double c) {
        return (Math.pow(b, 2)) - 4.0 * (a * c);
    }


}







































