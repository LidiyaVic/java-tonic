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

    /**
     * В калькуляторі, в методі ділення, краще додати перевірку другого параметра на 0.
     */
    public static int Div(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Ділення на нуль");
            } else {
                return a / b;
            }
        } catch (ArithmeticException e) {
            System.out.println("\n" +
                    "Сталася арифметична помилка: " + e.getMessage());
            return 0;
        }
    }
}
