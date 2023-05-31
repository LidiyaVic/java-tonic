package src.main.Java.HomeTask8.Part2;

public class Book implements Printable {
    String name;

    public Book(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println(name);
    }

    public static void printBooks(Printable[] printable) {
        System.out.println("\n" + "Книжки ");
        for (Printable book : printable) {
            if (book instanceof Book)
                book.print();
        }
    }
}
