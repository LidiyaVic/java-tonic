/**
 * Створити суперклас Shape, який буде містити в собі методи: calculateArea(), calculatePerimeter та paint().Та поле color;
 * Створити три класа нащадків: сircle, rectangle, triangle, які містять в собі координати точок, необхідних для cтворення цих фігур.
 * Перевизначити для класів нащадків необхідні методи
 * В класі main створити масив з обєктами фігур
 * В циклі викликати методи цих фігур
 * Коректно перевизначити методи equals(), hashCode(), toString().
 */
package src.main.Java.HomeTask7.Shape;

import java.util.Objects;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract void paint();
}

class Circle extends Shape {
    private final double radius;
    private final double centerX;
    private final double centerY;

    public Circle(String color, double radius, double centerX, double centerY) {
        super(color);
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void paint() {
        System.out.println(color + " circle at (" + centerX + ", " + centerY + ")");
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Circle other = (Circle) obj;
        return Double.compare(other.radius, radius) == 0 && Double.compare(other.centerX, centerX) == 0
                && Double.compare(other.centerY, centerY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, centerX, centerY);
    }

    @Override
    public String toString() {
        return "Circle [color=" + color + "Circle, radius=" + radius + ", centerX=" + centerX + ", centerY=" + centerY + "]";
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;
    private final double topLeftX;
    private final double topLeftY;

    public Rectangle(String color, double width, double height, double topLeftX, double topLeftY) {
        super(color);
        this.width = width;
        this.height = height;
        this.topLeftX = topLeftX;
        this.topLeftY = topLeftY;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void paint() {
        System.out.println(color + " rectangle at (" + topLeftX + ", " + topLeftY + ")");
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Rectangle other = (Rectangle) obj;
        return Double.compare(other.width, width) == 0 && Double.compare(other.height, height) == 0
                && Double.compare(other.topLeftX, topLeftX) == 0 && Double.compare(other.topLeftY, topLeftY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, topLeftX, topLeftY);
    }

    @Override
    public String toString() {
        return "Rectangle [color=" + color + ", width=" + width + ", height=" + height + ", topLeftX=" + topLeftX + ", topLeftY=" + topLeftY + "]";
    }
}

class Triangle extends Shape {
    private final double x1;
    private final double y1;
    private final double x2;
    private final double y2;
    private final double x3;
    private final double y3;

    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(String color, double x1, double y1, double x2, double y2, double x3, double y3) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        this.side1 = this.distance(x1, y1, x2, y2);
        this.side2 = this.distance(x2, y2, x3, y3);
        this.side3 = this.distance(x1, y1, x3, y3);
    }

    private double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void paint() {
        System.out.println(color + " triangle with sides " + side1 + ", " + side2 + ", " + side3);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Triangle other = (Triangle) obj;
        return Double.compare(other.x1, x1) == 0 && Double.compare(other.y1, y1) == 0
                && Double.compare(other.x2, x2) == 0 && Double.compare(other.y2, y2) == 0
                && Double.compare(other.x3, x3) == 0 && Double.compare(other.y3, y3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, x2, x3, y1, y2, y3);
    }

    @Override
    public String toString() {
        return "Triangle [color=" + color + ", side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
    }
}

