package course3.essential.topic03.classroom;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Good Pupil studies well");
    }
    @Override
    void read() {
        System.out.println("Good Pupil reads regularly");
    }
    @Override
    void write() {
        System.out.println("Good Pupil writes well");
    }
    @Override
    void relax() {
        System.out.println("Good Pupil relaxes moderately");
    }
}
