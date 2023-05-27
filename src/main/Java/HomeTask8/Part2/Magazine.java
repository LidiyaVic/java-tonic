package src.main.Java.HomeTask8.Part2;

public class Magazine implements Printable {
    String name;

    public Magazine(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println(name);
    }

    public static void printMagazines(Printable[] printable) {
        System.out.println("\n" + "Журнали ");
        for (Printable magazine : printable) {
            if (magazine instanceof Magazine)
                magazine.print();
        }
    }
}
