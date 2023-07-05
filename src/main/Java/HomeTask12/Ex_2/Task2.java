package src.main.Java.HomeTask12.Ex_2;

import src.main.Java.HomeTask8.Part2.Printable;

public class Task2 {
    public static void printMessage() {
        System.out.println("printMessage");
    }

    Printable printable = Task2::printMessage;
//    printable.print();
}
