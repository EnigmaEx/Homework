package Zadanie_1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Dog dog1 = new Dog("Шарик");

        cat1.run(150);
        cat1.swim(5);

        dog1.run(400);
        dog1.swim(5);

        System.out.println("Общее количество животных: " + Animal.getAnimalCount());

        Bowl bowl = new Bowl(20);

        Cat[] cats = {cat1, cat2};
        for (Cat cat : cats) {
            cat.eat(bowl, 15);
            System.out.println(cat.name + " сыт: " + !cat.isHungry());
        }

        bowl.addFood(10);
        for (Cat cat : cats) {
            if (cat.isHungry()) {
                cat.eat(bowl, 10);
                System.out.println(cat.name + " сыт: " + !cat.isHungry());
            }
        }
    }
}