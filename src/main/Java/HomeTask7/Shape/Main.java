package src.main.Java.HomeTask7.Shape;

import static src.main.Java.HomeTask9.Color.Color.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(LEMON + " " + LEMON.getHexCode(), 5.0, 10.0, 10.0);
        shapes[1] = new Rectangle(LAVENDER + " " + LAVENDER.getHexCode(), 4.0, 6.0, 0.0, 0.0);
        shapes[2] = new Triangle(IVORY + " " + IVORY.getHexCode(), 0.0, 0.0, 0.0, 5.0, 5.0, 0.0);

        for (Shape shape : shapes) {
            shape.paint();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println(" ");
        }
    }
}