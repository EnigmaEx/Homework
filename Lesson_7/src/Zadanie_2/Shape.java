package Zadanie_2;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();

    String getFillColor();
    String getBorderColor();

    void setFillColor(String color);
    void setBorderColor(String color);

    default void printInfo() {
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}