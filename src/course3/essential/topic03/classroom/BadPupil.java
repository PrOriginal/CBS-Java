package course3.essential.topic03.classroom;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Bad Pupil studies poorly");
    }
    @Override
    void read() {
        System.out.println("Bad Pupil rarely reads");
    }
    @Override
    void write() {
        System.out.println("Bad Pupil writes with mistakes");
    }
    @Override
    void relax() {
        System.out.println("Bad Pupil relaxes too much");
    }
}
