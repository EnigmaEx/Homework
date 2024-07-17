package Zadanie_1;

public class Main {
    public static void main(String[] args) {
        Dog dogKora = new Dog("Лорд");
        Cat catPusya = new Cat("Пушистик");

        dogKora.run(150);
        dogKora.swim(10);
        catPusya.run(150);
        catPusya.swim(3);

        Cat[] cats = {
                new Cat("Пушистик"),
                new Cat("Джони"),
                new Cat("Уголёк"),
                new Cat("Черныш"),
                new Cat("Димон")
        };

        Bowl bowl = new Bowl(30);

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
            System.out.println(cat.name + " сытость: " + cat.isFull());
        }

        bowl.addFood(20);
        System.out.println("Добавили еды в миску. Количество еды: " + bowl.getFood());

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Animal.catCount);
        System.out.println("Всего собак: " + Animal.dogCount);
    }
}