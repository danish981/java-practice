package Ch_3;

import java.util.Scanner;

public class AdditionQuiz {


    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //generate three single digit positive random numbers
        int digit1 = (int) (Math.random() * 10);
        int digit2 = (int) (Math.random() * 10);
        int digit3 = (int) (Math.random() * 10);

        System.out.println(digit3 + " + " + digit2 + " + " + digit1 + " = ");
        int userSum = input.nextInt();

        int actualSum = digit1 + digit2 + digit3;

        if (userSum == actualSum) {
            System.out.println("Correct");
        } else {
            System.out.println("You are wrong.");
            System.out.println("The answer is " + actualSum);
        }

    }

}
