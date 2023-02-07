import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {

    public static final List<String> STRING_LIST = Arrays.asList(
            "Onee",
            "tWo",
            "list",
            "windoWWW",
            "user authorization was successful",
            "this is A complex strUcture",
            "and who are the judges",
            "The ArrayList class supports dynamic arrays",
            "the arraylist class inherits from the abstractList class"
    );

    public static void main(String[] args) {
    }

    public static boolean checkAuth(String login) {
        boolean numbers = false,
                letters = false,
                underln = false;

        if (login.indexOf('_') >= 0) underln = true;

        for (char i = '0'; i <= '9'; i++) {
            if (login.indexOf(i) >= 0) {
                numbers = true;
                break;
            }
        }

        for (char i = 'a'; i <= 'z'; i++) {
            if (login.indexOf(i) >= 0 || login.indexOf(Character.toUpperCase(i)) >= 0) {
                letters = true;
                break;
            }
        }

        return (numbers && letters && underln);
    }
}
