package student;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Developers on 25-Nov-20.
 */
public class MarksClass {

    public int chemistry;
    public int biology;
    public int math;
    public int physics;
    public int english;
    public int urdu;

    public MarksClass() {
        chemistry = ThreadLocalRandom.current().nextInt(60, 100);
        biology = ThreadLocalRandom.current().nextInt(60, 100);
        math = ThreadLocalRandom.current().nextInt(60, 100);
        physics = ThreadLocalRandom.current().nextInt(60, 100);
        english = ThreadLocalRandom.current().nextInt(60, 100);
        urdu = ThreadLocalRandom.current().nextInt(60, 100);
    }


    public MarksClass(int chemistry, int biology, int math, int physics, int english, int urdu) {
        this.chemistry = chemistry;
        this.biology = biology;
        this.math = math;
        this.physics = physics;
        this.english = english;
        this.urdu = urdu;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getUrdu() {
        return urdu;
    }

    public void setUrdu(int urdu) {
        this.urdu = urdu;
    }

    public int getObtainedMarks() {
        return this.biology + this.urdu + this.english + this.physics + this.math + this.chemistry;
    }

    public float getPersontage() {
        return ((float)getObtainedMarks() / (float) 600) * (float) 100;
    }


}
