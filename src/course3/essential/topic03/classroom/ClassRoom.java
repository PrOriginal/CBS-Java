package course3.essential.topic03.classroom;

//ClassRoom consists of Pupils (composition)
public class ClassRoom {
    private Pupil[] pupils;

    ClassRoom(Pupil... pupils){ //Приймає 0 або більше елементів (varargs)
        this.pupils = new Pupil[4];
        for (int i = 0; i < pupils.length && i < 4; i++) {
            this.pupils[i] = pupils[i];
        }
        for (int i = pupils.length; i < 4; i++) {
            this.pupils[i] = new Pupil(); // Default pupil if not enough were provided
        }
    }

    void showActivities() {
        for (Pupil pupil : pupils) {
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(new ExcelentPupil(), new GoodPupil(), new BadPupil());
        classRoom.showActivities();
    }
}
