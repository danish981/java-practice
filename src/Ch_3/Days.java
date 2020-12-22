package Ch_3;

import java.util.Scanner;

/**
 * Created by Developers on 6/5/2020.
 */
public class Days {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a day number (1-7) of the week : ");
        int dayNumber = input.nextInt();


        System.out.println("Enter the days after : ");
        int afterDays = input.nextInt();

        boolean conditionOne = dayNumber > -1 && dayNumber < 7;

        boolean secondCondition = afterDays > 0 && afterDays < 10_000;

        if (conditionOne && secondCondition) {

            System.out.print("Today is ");
            switch (dayNumber) {
                case 0:
                    System.out.print("Sunday");
                    break;
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thursday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Saturday");
                    break;

            }   //end of switch

            System.out.print(" and after " + afterDays + " days, the day will be ");


            int newDay = dayNumber + afterDays;
            newDay = newDay % 7;

            switch (newDay) {
                case 0:
                    System.out.print("Sunday");
                    break;
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thursday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Saturday");
                    break;
            }


        }   //end of if e
        else {
            System.out.println("Invalid day number entered.");
            System.out.println("Run the program again");
        }

    }       //end of main method


}       //end of class
