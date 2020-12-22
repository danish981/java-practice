package PractPack;

import java.util.Scanner;

public class SampleCode {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter the lower limit ");
        int lowerLimit = input.nextInt();
        System.out.println("enter the upper limit ");
        int upperLimit = input.nextInt();

        if (lowerLimit > upperLimit) {
            int temp = lowerLimit;
            lowerLimit = upperLimit;
            upperLimit = temp;
        }

        System.out.println("how many random numbers you want to generate ");
        int totalNumbers = input.nextInt();
        totalNumbers = Math.abs(totalNumbers);

        int diff = upperLimit - lowerLimit;

        for (int i = 1; i <= totalNumbers; i++) {
            int randomNumber = (int) (Math.random() * diff) + lowerLimit;
            System.out.print(randomNumber + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }


    public static void additionQuiz() {
        int userScore = 0;
        int totalScore = 0;
        System.out.println("Total Number of Questions to be asked : ");
        int iterations = input.nextInt();
        iterations = Math.abs(iterations);
        for (int i = 1; i <= iterations; i++) {
            int digit1 = (int) (Math.random() * 10);
            int digit2 = (int) (Math.random() * 10);
            int digit3 = (int) (Math.random() * 10);

            totalScore++;
            System.out.print(digit1 + " + " + digit2 + " + " + digit3 + " = ");
            int userSum = input.nextInt();
            int actualSum = digit1 + digit2 + digit3;
            if (userSum == actualSum) {
                userScore++;
            }
        }
        System.out.println("your score  " + userScore + "/" + totalScore);
    }

    public static void multiplicationQuiz() {
        int totalScore = 0;
        int userScore = 0;
        System.out.println("Total Number of Questions to be asked : ");
        int iterations = input.nextInt();
        iterations = Math.abs(iterations);
        for (int i = 1; i <= iterations; i++) {
            int digit1 = (int) (Math.random() * 10) + 1;
            int digit2 = (int) (Math.random() * 10) + 1;

            totalScore++;
            System.out.print(digit1 + " x " + digit2 + " = ");
            int userProduct = input.nextInt();
            int actualProduct = digit1 * digit2;

            if (userProduct == actualProduct) {
                userScore++;
            }
        }
        System.out.println("your score is " + userScore + "/" + totalScore);
    }


}











