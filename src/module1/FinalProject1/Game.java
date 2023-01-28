package module1.FinalProject1;

import java.util.Scanner;

public class Game {
    Field field;
    Scanner scanner = new Scanner(System.in);
    char nextTurn;

    public Game() {
        this.field = new Field();
    }

    void createNewGame() {
        field.printField();
        System.out.print("Who steps the first? (X or 0): ");
        nextTurn = Character.toUpperCase(scanner.next().charAt(0));
        if (nextTurn != '0' && nextTurn != 'X') {
            System.out.println("Error. X is the first now");
            nextTurn = 'X';
        }
        playGame();
    }

    private void playGame() {
        while (true) {
            System.out.println(nextTurn + "'s turn");
            turn(nextTurn);
            if (field.isTie()) {
                System.out.println("Tie!");
                break;
            }
            if (field.isPlayerWin(nextTurn)) {
                System.out.println(nextTurn + " wins!");
                break;
            }
            if (nextTurn == 'X')
                nextTurn = '0';
            else
                nextTurn = 'X';
        }
    }

    //ход
    private void turn(char player) {
        System.out.print("Enter row and a column:");
        int temp = scanner.nextInt();
        int row = temp / 10;
        int column = temp % 10;
        //проверяем, удалось ли походить
        if (field.step(nextTurn, row, column)) {
            field.printField();
        } else
            //что то пошло не так, вызываем ещё раз
            turn(player);

    }
}
