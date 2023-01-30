package module2.HW1;

public class Student {
    int age;
    private int grade;
    String name;

    //default constructor
    public Student(){
        this.age = 0;
        this.grade = 1;
        this.name = "default";
    }

    public Student(int age, int grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    public void goToSchool(){
        System.out.println(name + " is going to school");
    }

    public void raiseAHand(){
        System.out.println(name + " has raised a hand");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
