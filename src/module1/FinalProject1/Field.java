package module1.FinalProject1;

public class Field {
    //размер пол€
    private final int size = 3;
    //кол-во клеточек дл€ победы
    private final int winNumber = 3;
    //массив пол€
    private char[][] field = new char[size][size];
    //оставшиес€ клеточки
    private int remain = size * size;

    //конструктор с заполнением клеточек пустыми пол€ми
    public Field() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = ' ';
            }
        }
    }
    //вывод пол€

    public void printField() {
        //верхние цифры дл€ обозначени€ колонок
        for (int i = 1; i <= size; i++) {
            System.out.print("   " + i);
        }
        System.out.println();
        //вывод цифры р€да и самого р€да
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < size; j++) {
                System.out.print(" [" + field[i][j] + "]");
            }
            System.out.println();
        }
        //ещЄ один sout дл€ красоты
        System.out.println();
    }
    //метод дл€ хода. возвращает, удалось ли походить или нет
    public boolean step(char player, int row, int column) {
        row--;
        column--;
        //проверка правильности координат и сколько осталось свободных клеточек
        if (remain > 0 && isXYCorrect(row, column)) {
            //проверка, пуста€ ли клеточка
            if (field[row][column] == ' ') {
                //ход
                field[row][column] = player;
                //уменьшение
                remain--;
                //походили, всЄ хорошо
                return true;
            } else {
                //если клеточка не пуста€, значит она зан€та
                System.out.println("this cell is busy \ntry again");
                printField();
                return false;
            }
        } else {
            //если оставшихс€ клеточек нет, то информируем о том, что клеточек
            //не осталось, иначе информируем о неправильных координатах
            System.out.print(!(remain > 0) ? "no empty cells" : "incorrect coordinates");
            System.out.println("try again");
            printField();
            return false;
        }
    }

    //метод дл€ проверки корректности координат
    private boolean isXYCorrect(int row, int column) {
        return row >= 0 && row < size && column >= 0 && column < size;
    }

    //метод дл€ проверки ничьи
    public boolean isTie() {
        return remain == 0 && !isPlayerWin('X') && !isPlayerWin('0');
    }

    //метод дл€ проверки победы
    public boolean isPlayerWin(char player) {
        boolean isWin = false;
        //по вертикали и горизонтали
        //   счетчик р€дов, счетчик в р€д, счетчик в столбик
        for (int row = 0, rowCount = 0, colCount = 0; row < size; row++) {
            //   счетчик колонок
            for (int column = 0; column < size; column++) {
                //если совпадает, то прибавл€ем 1 к счетчику в р€д
                if (field[row][column] == player) rowCount++;
                //если нет, то обнул€ем
                else rowCount = 0;
                //аналогично с р€дами
                if (field[column][row] == player) colCount++;
                else colCount = 0;
                //если счетчик р€дов или столбцов подр€д равен числу дл€ победы
                //то игрок победил
                if (rowCount == winNumber || colCount == winNumber) isWin = true;
            }
            //занул€ем переменные
            rowCount = 0;
            colCount = 0;
        }
        //по диагонали
        //счетчик колонок и р€дов, по главной подр€д, по побочной подр€д
        for (int i = 0, mainCount = 0, sideCount = 0; i < size; i++) {
            //почти аналогична€ проверка, как и с р€дами выше
            if (field[i][i] == player) mainCount++;
            else mainCount = 0;
            if (field[size - 1 - i][i] == player) sideCount++;
            else sideCount = 0;
            if (mainCount == winNumber) isWin = true;
            if (sideCount == winNumber) isWin = true;
        }
        return isWin;
    }
}
