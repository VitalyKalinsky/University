package module2.HW6;

public class HomeWork6 {
    /*
    Создать абстрактный класс Инструмент и наследующие от него классы Гитара, Барабан и Труба.
    Инструмент содержит абстрактный метод play() и переменную String KEY ="До мажор".
    Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
    Создать массив типа Инструмент, содержащий инструменты разного типа.
    В цикле вызвать метод play() для каждого инструмента,
    который должен выводить строку "Играет такой-то инструмент, с такими-то характеристиками".

    Создайте 3 интерфейса, Game, TableGame extends Game, ComputerGame extends Game.
    Интерфейс Game должен содержать метод void start() и метод Boolean end().
    Интерфейс TableGame должен содержать метод void rollDice().
    Интерфейс ComputerGame должен содержать метод void shoot() и метод void move().

    Создайте 2 класса - реализации:
        SnakesAndLadders implements TableGame
        CounterStrike implements ComputerGame

    Объекты класса настольные игры не должны уметь нажимать на кнопку,
    объекты класса компьютерные игры не должны уметь бросать кубик.
    Создайте класс дом, в котором создайте 2 объекта от каждого класса и вызовите все методы,
    которые каждый из них умеет.
 */
    public static void main(String[] args) {
        Instrument[] instruments =
                {new Guitar(6), new Drum(50), new Trumpet(5)};
        for (Instrument instrument : instruments) instrument.play();
    }
}
