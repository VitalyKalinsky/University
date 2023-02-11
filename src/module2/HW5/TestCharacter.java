package module2.HW5;

public class TestCharacter extends Character {
    private static class CreatingException extends Exception {
        public CreatingException(String name) {
            super("wrong name: " + name);
        }
    }

    private TestCharacter(String name, int hp, int atk) throws CreatingException {
        super("Test", hp, atk);
        if(!name.equals("Test")) throw new CreatingException(name);
    }
}
