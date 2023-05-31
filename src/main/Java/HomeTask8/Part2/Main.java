package src.main.Java.HomeTask8.Part2;

public class Main {
    public static void main(String[] args) {
        Printable[] printable = {
                new Book("Леся Українка"),
                new Book("Тарас Шевченко"),
                new Book("Ліна Костенко"),
                new Magazine("Кулінарія"),
                new Magazine("Полювання"),
                new Magazine("Рибалка" + "\n")
        };
        for (Printable p : printable) {
            p.print();
        }

        Book.printBooks(printable);
        Magazine.printMagazines(printable);
    }
}