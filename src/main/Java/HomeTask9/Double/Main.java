package src.main.Java.HomeTask9.Double;

/**
 * Класи обгортки:
 * Створіть об'єкти класу Double за допомогою методів valueOf().
 * Перетворити значення типу String на тип double. Використовуємо метод Double.parseDouble().
 * Перетворити об'єкт класу Double на всі примітивні типи (byte, short, int, long, char, float, double, boolean)
 * Вивести значення об'єкта Double на консоль.
 * Перетворити літерал типу double до рядка: String d = Double.toString(3.14);
 */
public class Main {
    public static void main(String[] args) {
        // * Створіть об'єкти класу Double за допомогою методів valueOf()
        Double doubleObject1 = Double.valueOf(435.32);
        Double doubleObject2 = Double.valueOf("7.1715");
        System.out.println(doubleObject1);
        System.out.println(doubleObject2);

        // * Перетворити значення типу String на тип double. Використовуємо метод Double.parseDouble().
        String str = "5.329";
        double number = Double.parseDouble(str);
        System.out.println(number);


        // * Перетворити об'єкт класу Double на всі примітивні типи (byte, short, int, long, char, float, double, boolean)
        byte byteType = doubleObject1.byteValue();
        System.out.println("Примітивний тип byte " + byteType);

        short shortType = doubleObject2.shortValue();
        System.out.println("Примітивний тип short " + shortType);

        int intType = doubleObject1.intValue();
        System.out.println("Примітивний тип int " + intType);

        long longType = doubleObject2.longValue();
        System.out.println("Примітивний тип long " + longType);

        float floatType = doubleObject1.floatValue();
        System.out.println("Примітивний тип float " + floatType);

        // * Вивести значення об'єкта Double на консоль.
        System.out.println(doubleObject1);

        // * Перетворити літерал типу double до рядка: String d = Double.toString(3.14);
        double num = 3.14159;
        String doubeToString = Double.toString(num);
        System.out.println(doubeToString);
    }
}
