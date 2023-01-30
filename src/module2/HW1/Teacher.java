package module2.HW1;

public class Teacher {
    Student[] students = new Student[3];

    public Teacher(){
        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
        }
    }

    public Teacher(Student[] students) {
        this.students = students;
    }

    void printStudents(){
        for (int i = 0; i < 3; i++) {
            System.out.println(students[i].name);
            System.out.println(students[i].age);
            System.out.println(students[i].getGrade());
        }
    }

    void teach(){
        for (int i = 0; i < 3; i++) {
            students[i].raiseAHand();
            students[i].goToSchool();
        }
    }
}
