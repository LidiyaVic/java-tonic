package src.main.Java.HomeTask2;

/**
 * 2.Створити класс Calculator, який буде мати статичні методи для базових арифметичних обчислень.
 * В классі Main, викликати методи классу Calculator, для перевірки
 */

public class Calculator {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Min(int a, int b) {
        return a - b;
    }

    public static int Mult(int a, int b) {
        return a * b;
    }

    public static int Div(int a, int b) {
        return a / b;
    }
}
