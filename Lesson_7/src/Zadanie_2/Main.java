package Zadanie_2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Red", "Black");
        Shape rectangle = new Rectangle(4, 7, "Blue", "Green");
        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        Shape[] shapes = { circle, rectangle, triangle };

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println();
        }
    }
}