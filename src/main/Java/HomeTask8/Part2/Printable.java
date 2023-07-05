package src.main.Java.HomeTask8.Part2;

public interface Printable {
    void print();

    Printable printable = () -> System.out.println("Лямбда");
}