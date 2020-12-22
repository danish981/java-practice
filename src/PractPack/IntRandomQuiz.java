package PractPack;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Developers on 31-Oct-20.
 */
public class IntRandomQuiz {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("lower limit : ");
        int lowerLimit = input.nextInt();
        lowerLimit = Math.abs(lowerLimit);

        System.out.println("upper limit : ");
        int upperLimit = input.nextInt();
        upperLimit = Math.abs(upperLimit);

        System.out.println("how many random numbers you want to generate ? ");
        int numRandom = input.nextInt();
        numRandom = Math.abs(numRandom);

        int temp;
        if (lowerLimit > upperLimit) {
            temp = lowerLimit;
            lowerLimit = upperLimit;
            upperLimit = temp;
        }

        if (upperLimit == 0 && lowerLimit == 0) {
            lowerLimit = 10;
            upperLimit = 99;
        }

        int arrayRandom[] = new int[numRandom];

        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = ThreadLocalRandom.current().nextInt(lowerLimit, upperLimit);
        }

        System.out.println("ARRAY BEFORE SORTING");
        Methods.printArray(arrayRandom, 10);
        System.out.println("--------------------");


        Sorts.bubbleSort(arrayRandom);

        System.out.println("ARRAY AFTER SORTING");
        Methods.printArray(arrayRandom, 10);
        System.out.println("--------------------");


    }
}
