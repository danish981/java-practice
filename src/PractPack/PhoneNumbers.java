package PractPack;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Developers on 11-Dec-20.
 */
public class PhoneNumbers {

    public static void main(String[] args) {

        String phoneNumbersArray[] = new String[100];

        for (int i = 1; i <= 1000; i++) {
            String simCode = "03" + digit(0, 4) + digit(0, 7);
            String number = "" + digit() + digit() + " " + digit() + digit() + " " + digit() + digit() + digit();
            String phoneNumber = simCode + number;
            if (i < 100)
                phoneNumbersArray[i - 1] = phoneNumber;
        }

        printArray(phoneNumbersArray);

    }

    private static void printArray(String array[]) {
        if (array.length == 0)
            return;
        for (String anArray : array) {
            System.out.println(anArray);
        }
    }

    private static int digit() {
        return ThreadLocalRandom.current().nextInt(0, 9);
    }

    private static int digit(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }


}
