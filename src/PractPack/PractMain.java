package PractPack;

import java.util.Scanner;

/**
 * Created by Developers on 03-Dec-20.
 */
public class PractMain {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter number : ");
        int num = input.nextInt();
        if (num == 0) {
            System.out.println("factorial of " + num + " is " + 1);
            System.exit(0);
        }
        num = Math.abs(num);
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
            System.out.print(i);
            if (i < num)
                System.out.print(" x ");
        }
        System.out.print(" = " + fact);
        System.out.println("\nfactorial of " + num + " is " + fact);

    }


}
