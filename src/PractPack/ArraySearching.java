package PractPack;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Developers on 16-Dec-20.
 */
public class ArraySearching {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the length of Array : ");
        int arrayLength = input.nextInt();
        arrayLength = Math.abs(arrayLength);
        int arrayNum[] = new int[arrayLength];

        // filling the array with random numbers
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = ThreadLocalRandom.current().nextInt(10, 99);
        }
        


        // code for searching an element from array
        System.out.println("ENTER NUMBER TO SEARCH FROM THE ARRAY");
        int numSearch = input.nextInt();
        while (numSearch != -1) {
            int indexFound;
            // incorrect logic applied here
            for (int i = 0; i < arrayNum.length; i++)
                if (numSearch == arrayNum[i]) {
                    indexFound = i;
                    System.out.println(numSearch + " found at index [" + indexFound + "].");
                }
        }


    }
}
