package module2.HW1;

public class University {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];
        for (int i = 0; i < 3; i++) {
            teachers[i] = new Teacher(); //hired a teacher
            System.out.println("teacher's methods:\nteacher.printStudents():");
            teachers[i].printStudents();
            System.out.println("teacher.teach():");
            teachers[i].teach();
            System.out.println("--------------------------- \nstudents' methods:");
            for (int j = 0; j < teachers[i].students.length; j++) {
                teachers[i].students[j].raiseAHand();
                teachers[i].students[j].goToSchool();
            }
            System.out.println("---------------------------");
        }
    }
}
