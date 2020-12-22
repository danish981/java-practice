package PractPack;

import java.util.Scanner;

/**
 * Created by Developers on 5/3/2020.
 * we will learn how exception handling works
 */
public class ExHandle {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        // we will learn exception handling here

        System.out.println("Enter your full name : ");
        String fullName = input.nextLine();

        System.out.println("your name is " + fullName);
        System.out.println("your name " + fullName + " has " + fullName.length() + " characters.");


    }
}
