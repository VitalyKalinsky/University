public class Main {
    public static void main(String[] args) {
        String eng = "Java";
        String en = "Java";
        String regex = "[a-zA-z]";
        String reg1 = "_";
        String reg2 = "\\d";
        System.out.println("true: " + checkAuth(eng));
        System.out.println(eng.matches(".*\\d.*") && eng.matches(".*\\w*.*") && eng.matches(".*_*.*"));
        System.out.println(eng.matches(".*\\d+.*"));
        System.out.println(eng.matches(".*\\w+.*"));
        System.out.println(eng.matches(".*_+.*"));
        System.out.println("false: " + checkAuth(en));
    }

    public static boolean check(String login) {
        return !(login.contains("_") && login.contains("\\d") && login.contains("[a-zA-Z]"));
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
