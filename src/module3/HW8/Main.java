package module3.HW8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Vitaly", new Address("Saint-Petersburg", "Nevsky"));
        Student student2 = new Student("Dmitry", new Address("Moscow", "Moscow-City"));
        Student student3 = new Student("Sofia");
        printStudentInfo(student1);
        printStudentInfo(student2);
        printStudentInfo(student3);
        System.out.println("------------------------------------------");
        List<String> words = new LinkedList<>(
                Arrays.asList("Return", " true", " if", " there", " is", " a", " value",
                        " present", " otherwise", " false."));
        System.out.println(words);
        System.out.println(words.stream().reduce((x, y) -> x + y).get());
    }

    public static void printStudentInfo(Student student) {
        System.out.println("Name='" + student.getName() + '\'');
        student.getAddress().ifPresent(System.out::println);
    }
}
