package PractPack;

import java.util.Scanner;

public class TestApp {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many numbers you want to enter ?: ");
        int totalNum = input.nextInt();
        totalNum = Math.abs(totalNum);

        if (totalNum > 50) {
            totalNum = 20;
        }

        int arrayNum[] = new int[totalNum];

        System.out.println("ENTER " + totalNum + " NUMBERS ");
        for (int i = 0; i < totalNum; i++) {
            System.out.print("number " + (i + 1) + " :  ");
            arrayNum[i] = input.nextInt();
        }

        input.nextLine();

        System.out.println("\n\nEnter the operation you want to perform\n" +
                "A for finding the largest number\n" +
                "B for finding the minimum number\n" +
                "C for finding the average of all the numbers\n" +
                "D for finding the sum of all the numbers");
        String prompt = input.nextLine();
        prompt = prompt.toUpperCase();

        // error in the condition
        boolean condition = prompt.charAt(0) != 'A' && prompt.charAt(0) != 'a' && prompt.charAt(0) != 'B' && prompt.charAt(0) != 'b' && prompt.charAt(0) != 'C' && prompt.charAt(0) != 'c' && prompt.charAt(0) != 'D' && prompt.charAt(0) != 'd';

        while (condition) {
            switch (prompt.charAt(0)) {
                case 'A':
                    System.out.println("looking for MAXIMUM number into the array .............");
                    System.out.println("the maximum number is " + getMax(arrayNum));
                    break;
                case 'B':
                    System.out.println("looking for MINIMUM number into the array .............");
                    System.out.println("the MINIMUM number is " + getMin(arrayNum));
                    break;
                case 'C':
                    System.out.println("calculating the AVERAGE of all the entered numbers ..........");
                    System.out.println("the AVERAGE of numbers is " + calculateAverage(arrayNum));
                    break;
                case 'D':
                    System.out.println("calculating the SUM of all the entered numbers ..........");
                    System.out.println("the SUM of numbers is " + calculateSum(arrayNum));
                    break;
                default:
                    System.out.println("INVALID INPUT\nRun again the program\nProgram is terminating");
                    System.exit(0);
            }
        }


    }

    private static int calculateSum(int array[]) {
        int sum = 0;
        for (int anArray : array) {
            sum = sum + anArray;
        }
        return sum;
    }

    private static double calculateAverage(int array[]) {
        return (double) calculateSum(array) / (double) array.length;
    }


    private static int getMin(int array[]) {
        int testMax = array[0];
        for (int anArray : array) {
            if (anArray < testMax) {
                testMax = anArray;
            }
        }
        return testMax;
    }

    private static int getMax(int array[]) {
        int testMax = array[0];
        for (int anArray : array) {
            if (anArray > testMax) {
                testMax = anArray;
            }
        }
        return testMax;
    }

}
