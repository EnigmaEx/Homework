package Zadanie_1;

public abstract class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected static int animalCount = 0;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + " " + (distance <= maxRunDistance ? "пробежал " : "не может пробежать ") + distance + " м.");
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать.");
        } else {
            System.out.println(name + " " + (distance <= maxSwimDistance ? "проплыл " : "не может проплыть ") + distance + " м.");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}