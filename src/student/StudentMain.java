package student;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Developers on 25-Nov-20.
 */
public class StudentMain {
    public static void main(String[] args) {

        MarksClass[] studentMarks = new MarksClass[100];

        for (MarksClass studentMark : studentMarks) {
            // null pointer exception here
            studentMark.chemistry = getRandomNumber(30, 100);
            studentMark.biology = getRandomNumber(30, 100);
            studentMark.english = getRandomNumber(30, 100);
            studentMark.urdu = getRandomNumber(30, 100);
            studentMark.math = getRandomNumber(30, 100);
            studentMark.physics = getRandomNumber(30, 100);
        }


        for (int i = 0; i < studentMarks.length; i++) {
            System.out.println("Student " + studentMarks[i + 1] + " Details");
            System.out.println("--------------------------------------");
            System.out.println("Chemistry   " + studentMarks[i].chemistry);
            System.out.println("Biology     " + studentMarks[i].biology);
            System.out.println("English     " + studentMarks[i].english);
            System.out.println("Urdu        " + studentMarks[i].urdu);
            System.out.println("Mathematics " + studentMarks[i].math);
            System.out.println("Physics     " + studentMarks[i].physics);
            System.out.println("--------------------------------------");
            System.out.println("OBTAINED MARKS  " + studentMarks[i].getObtainedMarks());
            System.out.println("PERCENTAGE OF MARKS " + studentMarks[i].getPersontage());
            System.out.println("======================================");
        }


    }

    public static int getRandomNumber(int lowerLimit, int upperLimit) {
        return ThreadLocalRandom.current().nextInt(lowerLimit, upperLimit);
    }


}
