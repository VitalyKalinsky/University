package module1.FinalProject1;

public class Field {
    //������ ����
    private final int size = 3;
    //���-�� �������� ��� ������
    private final int winNumber = 3;
    //������ ����
    private char[][] field = new char[size][size];
    //���������� ��������
    private int remain = size * size;

    //����������� � ����������� �������� ������� ������
    public Field() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = ' ';
            }
        }
    }
    //����� ����

    public void printField() {
        //������� ����� ��� ����������� �������
        for (int i = 1; i <= size; i++) {
            System.out.print("   " + i);
        }
        System.out.println();
        //����� ����� ���� � ������ ����
        for (int i = 0; i < size; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < size; j++) {
                System.out.print(" [" + field[i][j] + "]");
            }
            System.out.println();
        }
        //��� ���� sout ��� �������
        System.out.println();
    }
    //����� ��� ����. ����������, ������� �� �������� ��� ���
    public boolean step(char player, int row, int column) {
        row--;
        column--;
        //�������� ������������ ��������� � ������� �������� ��������� ��������
        if (remain > 0 && isXYCorrect(row, column)) {
            //��������, ������ �� ��������
            if (field[row][column] == ' ') {
                //���
                field[row][column] = player;
                //����������
                remain--;
                //��������, �� ������
                return true;
            } else {
                //���� �������� �� ������, ������ ��� ������
                System.out.println("this cell is busy \ntry again");
                printField();
                return false;
            }
        } else {
            //���� ���������� �������� ���, �� ����������� � ���, ��� ��������
            //�� ��������, ����� ����������� � ������������ �����������
            System.out.print(!(remain > 0) ? "no empty cells" : "incorrect coordinates");
            System.out.println("try again");
            printField();
            return false;
        }
    }

    //����� ��� �������� ������������ ���������
    private boolean isXYCorrect(int row, int column) {
        return row >= 0 && row < size && column >= 0 && column < size;
    }

    //����� ��� �������� �����
    public boolean isTie() {
        return remain == 0 && !isPlayerWin('X') && !isPlayerWin('0');
    }

    //����� ��� �������� ������
    public boolean isPlayerWin(char player) {
        boolean isWin = false;
        //�� ��������� � �����������
        //   ������� �����, ������� � ���, ������� � �������
        for (int row = 0, rowCount = 0, colCount = 0; row < size; row++) {
            //   ������� �������
            for (int column = 0; column < size; column++) {
                //���� ���������, �� ���������� 1 � �������� � ���
                if (field[row][column] == player) rowCount++;
                //���� ���, �� ��������
                else rowCount = 0;
                //���������� � ������
                if (field[column][row] == player) colCount++;
                else colCount = 0;
                //���� ������� ����� ��� �������� ������ ����� ����� ��� ������
                //�� ����� �������
                if (rowCount == winNumber || colCount == winNumber) isWin = true;
            }
            //�������� ����������
            rowCount = 0;
            colCount = 0;
        }
        //�� ���������
        //������� ������� � �����, �� ������� ������, �� �������� ������
        for (int i = 0, mainCount = 0, sideCount = 0; i < size; i++) {
            //����� ����������� ��������, ��� � � ������ ����
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
