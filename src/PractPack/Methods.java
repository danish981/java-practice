package PractPack;

import java.util.Random;

public class Methods {

    /**
     * <h3>toDigits(double decimalNum, int digits)</h3>
     * <p>This method will return the double type decimalNum with specified digits after decimal point</p>
     *
     * @param decimalNum the double type non-zero number
     * @param digits     the non-zero and non-negative number of digits with a reasonable value
     * @return the double type decimalNum with specified digits after decimal point
     */
    public static double toDigits(double decimalNum, int digits) {
        digits = Math.abs(digits);
        double multiplier = Math.pow(10, digits);
        double multiplied = decimalNum * multiplier;
        int toIntCasted = (int) (multiplied); //removed extra decimal digits
        return toIntCasted / multiplier;
    }


    /**
     * <h3>calculatePasswordStrength(String password)</h3>
     * <p>This method calculates the strength of the password the returns the number between 1 and 10</p>
     *
     * @param password the string passed to the method
     * @return returns the strength of the password
     */
    public static int calculatePasswordStrength(String password) {

        //total score of password
        int iPasswordScore = 0;

        if (password.length() < 8)
            return 0;
        else if (password.length() >= 10)
            iPasswordScore += 2;
        else
            iPasswordScore += 1;

        //if it contains one digit, add 2 to total score
        if (password.matches("(?=.*[0-9]).*"))
            iPasswordScore += 2;

        //if it contains one lower case letter, add 2 to total score
        if (password.matches("(?=.*[a-z]).*"))
            iPasswordScore += 2;

        //if it contains one upper case letter, add 2 to total score
        if (password.matches("(?=.*[A-Z]).*"))
            iPasswordScore += 2;

        //if it contains one special character, add 2 to total score
        if (password.matches("(?=.*[~!@#$%^&*()_-|?/<>,.:;']).*"))
            iPasswordScore += 2;

        return iPasswordScore;

    }


    /**
     * <h3>vowelCounter(String str)</h3>
     * <p>this method will return number of vowels in passed string</p>
     *
     * @param str non-empty string
     * @return the number of vowels in string, if string is empty it returns 0
     */
    public static int vowelCounter(String str) {
        if (str.isEmpty()) {
            return 0;
        } else {
            int counter = 0;
            for (int i = 0; i < str.length(); i++) {
                if (isVowel(str.charAt(i))) {
                    counter++;
                }
            }
            return counter;
        }
    }

    /**
     * <h3>isVowel(char ch)</h3>
     * <p>this method will return true if character is vowels, false otherwise</p>
     *
     * @param ch any character
     * @return true if vowels, false otherwise
     */
    private static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u';
    }


    /**
     * <pre>getRandInLimits(int lowerLimit, int upperLimit)</pre>
     *
     * @param lowerLimit the lower limit
     * @param upperLimit the upper limit
     * @return the random number in between the upper limit and lower limit exclusively
     */
    public static int getRandInLimits(int lowerLimit, int upperLimit) {
        Random random = new Random();
        return random.nextInt(upperLimit - lowerLimit) + lowerLimit;
    }


    /**
     * <pre>printArray(int array[], int col)</pre>
     *
     * @param array any array of integers
     * @param col   number of columns in which the array will be printed
     */
    public static void printArray(int array[], int col) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            if ((i + 1) % col == 0) {
                System.out.println();
            }
        }
    }


    /**
     * <p>prints the array using tabs after each element</p>
     *
     * @param array any array of integers
     */
    public static void printArray(int array[]) {
        for (int anArray : array) {
            System.out.print(anArray + "\t");
        }
    }


    /**
     * <pre>getMinFromArray(int array[])</pre>
     *
     * @param array any integer type array
     * @return the lower number from the array
     */
    public static int getMinFromArray(int[] array) {
        int tmp = array[0];
        for (int anArray : array) {
            if (anArray < tmp) {
                tmp = anArray;
            }
        }
        return tmp;
    }

    /**
     * <pre>getMaxFromArray(int array[])</pre>
     *
     * @param array any integer type array
     * @return the highest number from the array elements
     */
    public static int getMaxFromArray(int array[]) {
        int max = array[0];
        for (int anArray : array) {
            if (anArray > max) {
                max = anArray;
            }
        }
        return max;
    }

    /**
     * @param array any integer type array
     * @return the average of all the number inside the array
     */
    public static int getAverageNum(int array[]) {
        int sum = 0;
        for (int value : array) {
            sum = sum + value;
        }

        int totalNumbers = array.length;
        return sum / totalNumbers;

    }

    /**
     * <h3>isArrayEmpty(int array[])</h3>
     * <p>Returns true if the array is empty and false otherwise</p>
     *
     * @param array an int type array
     * @return true if array is emtpy
     */
    private static boolean isArrayEmpty(int array[]) {
        return array.length == 0;
    }


    /**
     * <h3>countRepeatingElements(int array[], int target)</h3>
     * <p>Returns the number of repeating elements existing an array. Returns the number of repetitions. If array is empty,
     * returns -1. </p>
     *
     * @param array  an int type array
     * @param target int type number to be searched into array to count repetitions
     * @return number of repetitions from array, -1 is array is empty, 0 if no repetitions found
     */
    public static int countRepeatingElements(int array[], int target) {
        if (isArrayEmpty(array)) {
            return -1;
        }

        int counter = 0;
        for (int anArray : array) {
            if (target == anArray) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * <h3>countRepeatingElements(double array[], double target)</h3>
     * <p>Returns the number of repeating elements existing in this array.</p>
     *
     * @param array  double type array
     * @param target a double type number
     * @return -1 if array is blank, 0 if no repeating element found, or a number, of how many times found
     */
    public static int countRepeatingElements(double array[], double target) {
        if (array.length == 0) {
            return -1;
        }
        int counter = 0;
        for (double anArray : array) {
            if (anArray == target) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * <h3>drawPattern(char c, int rows, int columns)</h3>
     * <p>This method will print the character into given rows and columns in square or in rectangle. If the number
     * of rows or columns are greater than 500, then these two values will be replaced by another value</p>
     *
     * @param c       any character
     * @param rows    valid number of rows
     * @param columns valid number of columns
     */
    public static void drawPattern(char c, int rows, int columns) {
        if (rows > 500 || rows == 0 || rows < 0) {
            rows = 20;
        }
        if (columns > 500 || columns == 0 || columns < 0) {
            columns = 30;
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    /**
     * <h3>getRandInDigits(int digits)</h3>
     * <p>This method will return an int consisting of int digits passed to it</p>
     *
     * @param digits a non-zero int digits
     * @return a random number consiting on number of digits as passed to it
     */
    public static int getRandomInDigits(int digits) {
        int lowerLimit = (int) ((Math.pow(10, digits - 1)));
        int upperLimit = (int) ((Math.pow(10, digits) - 1));
        int diff = upperLimit - lowerLimit;
        return (int) (Math.random() * diff) + lowerLimit;
    }

    /**
     * <h3>populateArrayRand(int[] array)</h3>
     * <p>This method receieve an int type array will fill with random numbers of two digits, ranging from 10 to 99 and
     * then return the array</p>
     *
     * @param array int type array
     * @return an array filled with random numbers of two digits 10-99
     */
    public static int[] populateArrayRand(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Methods.getRandomInDigits(2);
        }
        return array;
    }

    /**
     * <h3>populateArrayRand(int[] array)</h3>
     * <p>This method receieve an int type array will fill with random numbers of two digits, ranging from 10 to 99 and
     * then return the array</p>
     *
     * @param array  int type array
     * @param digits an int type number with number of digits lower than 10 or integer upper limit
     * @return an array filled with random numbers of two digits 10-99
     */
    public static int[] populateArrayRandoms(int[] array, int digits) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Methods.getRandomInDigits(Math.abs(digits));
        }
        return array;
    }


}       //end of methods class




