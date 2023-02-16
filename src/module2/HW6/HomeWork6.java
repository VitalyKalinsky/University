package module2.HW6;

public class HomeWork6 {
    /*
    ������� ����������� ����� ���������� � ����������� �� ���� ������ ������, ������� � �����.
    ���������� �������� ����������� ����� play() � ���������� String KEY ="�� �����".
    ������ �������� ���������� ������ ���������������,  ������� - ������, ����� - �������.
    ������� ������ ���� ����������, ���������� ����������� ������� ����.
    � ����� ������� ����� play() ��� ������� �����������,
    ������� ������ �������� ������ "������ �����-�� ����������, � ������-�� ����������������".

    �������� 3 ����������, Game, TableGame extends Game, ComputerGame extends Game.
    ��������� Game ������ ��������� ����� void start() � ����� Boolean end().
    ��������� TableGame ������ ��������� ����� void rollDice().
    ��������� ComputerGame ������ ��������� ����� void shoot() � ����� void move().

    �������� 2 ������ - ����������:
        SnakesAndLadders implements TableGame
        CounterStrike implements ComputerGame

    ������� ������ ���������� ���� �� ������ ����� �������� �� ������,
    ������� ������ ������������ ���� �� ������ ����� ������� �����.
    �������� ����� ���, � ������� �������� 2 ������� �� ������� ������ � �������� ��� ������,
    ������� ������ �� ��� �����.
 */
    public static void main(String[] args) {
        Instrument[] instruments =
                {new Guitar(6), new Drum(50), new Trumpet(5)};
        for (Instrument instrument : instruments) instrument.play();
    }
}
