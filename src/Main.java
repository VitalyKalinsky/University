import java.util.*;

public class Main {

    private static final List<String> FULL_NAMES = List.of(
            "Joseph Smith", "Thomas Doyle", "Ronald Pratt", "Thomas Spencer", "King Lee",
            "Gregory Smith", "Leroy Zimmerman", "Lee Smith", "Michael Harrington", "Lee Daniels",
            "Eugene Williams", "Lee Terry", "Arnold Fowler", "Billy Harrison", "Lee Bennett", "Lee Evans",
            "Ronald Diaz", "Leonard King", "Timothy Smith", "George Lee", "King Mann", "Dean Wright",
            "Lee Richards", "Arthur Smith", "Gregory Moore", "Larry Hall", "Patrick Moore", "Ben Smith",
            "Jose Smith", "Michael Parker", "Jeff Smith", "Larry Thompson", "Joel Smith", "Ivan Spencer",
            "Robert Anderson", "Lee Phillips", "Stanley Warren", "William Sanchez", "Jamie McDonald",
            "David Griffith", "Terry Hicks", "Larry Johnson", "Mike Fowler", "Ivan Shaw", "Lee Stevenson",
            "Lee Powell", "Larry King", "Lee Mitchell", "Robert Diaz", "John Fowler", "Todd Cox",
            "David James", "Willie Bryan", "Thomas Howard", "Ivan Stanley", "Paul Harper", "Robert King",
            "David Stanley", "Dale Fletcher", "Larry Mullins", "Arthur King", "Robert King", "John King",
            "Larry Coleman", "Anthony King", "Ivan Johnson", "Ivan Mann", "Michael Diaz", "Leroy Smith",
            "King Wagner", "David Stanley", "Ivan Willis", "Ivan Stewart", "Frank King", "Roland Jones",
            "Leroy Warren", "Rodney Bailey", "David King", "Randy King", "James Soto", "James Parker",
            "Bobby Stanley", "Leroy Cooper", "Michael Woods", "David Mann", "Lee Padilla", "Samuel Shelton",
            "Jesse Simmons", "Ivan Stanley", "Lee Gibson", "Bryan King", "David Brooks", "David Fowler",
            "Robert Fowler", "Ivan King", "Donald Thomas", "Leroy Ramsey", "Russell Diaz", "David Torres"
    );

    public static void main(String[] args) {
        int i = (int) FULL_NAMES.stream()
                .flatMap(el -> Arrays.stream(el.split(" ")))
                .filter(el -> el.length() > 5)
                .distinct()
                .count();
        System.out.println(i);
    }
}