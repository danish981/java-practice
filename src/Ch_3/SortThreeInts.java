package Ch_3;

import java.util.Scanner;

/**
 * Created by Developers on 6/5/2020.
 */
public class SortThreeInts {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter three integers");
        System.out.print("First number : ");
        int num1 = input.nextInt();
        System.out.print("Second number : ");
        int num2 = input.nextInt();
        System.out.print("Third number : ");
        int num3 = input.nextInt();

        if (num1 == num2 || num2 == num3) {
            System.out.println("Numbers cannot be the same");
            System.out.println("Run the program again");
            System.out.println("Program is terminating");
            System.exit(0);
        }


    }
}
