package module2.HW5;

public class HomeWork5 {
    /*
        �������� �������:
        �������� ����� "��������", ���������� 3 �������������� (3 ���� ������) � 3 �������� (3 ������).
        ����������� ������ �� ������ ��������� ��������� ��� �����.
        ���������� ������������ �� ���� ����������.
        �� �������� �������� ���� ������, � ��� �� � �������� � ��������, ���� ��� ����� � ����� ����������.
        ���������� � �������� 2 ����� ������, ��������� � ������, ������� ����� ������������� �� "���������".
        -� ������ �� ����� ������� �������������� ����������� �������� ����� �������,
            ����� �������� ���������� ����� �������������� "����".
	    � ������� ����� ��������.
        -���������� � ������ �� ����� ������� �������������� �� ������ �������� ����� ������ ��������.
	    ��� ����� �������������� �������. ���������� �������� ���������, � ��� �� ���������� � �������
	    �� �������������� �����, ������� ����� ���������� �� �����.
        -����������� �� ������ �������� ������. ��� ����� ��������� �����. �������� � ������� ������ ���������
	    ���� ����� ������� ���� � ����������� �� ����. � ���������� � ����������� �� ����,
	    � � ������� � ����������� �� ��������.
        �������� ����� ��������� ������������, ������� ����� ������������� �� ������ "��������".
        ��������� ��������� ������� ����� ������ ���� ����� ������������.
        ��� �����:
        -������� ����� ������ �������� ���������.
        -�������� ��� ������, ����� ���������� �������� ������ ��������� ������ ������������,
            ����� ��������� � ������ "Test".
     */
    public static void main(String[] args) {
        Character character = new Character("character", 1000, 150);
        character.attack();
        character.defend(15);
        character.walk("Saint-Petersburg");
        character.welcome();
        System.out.println();

        Wizard wizard = new Wizard("anti-mage", 1000, 150, 100);
        wizard.attack();
        wizard.attack(50);
        wizard.attack(150);
        wizard.defend(15);
        wizard.walk("Saint-Petersburg");
        wizard.welcome();
        System.out.println();

        Archer archer = new Archer("arc warden", 1000, 150, 100);
        archer.attack();
        archer.attack(50);
        archer.attack(150);
        archer.defend(15);
        archer.walk("Saint-Petersburg");
        archer.welcome();


    }
}