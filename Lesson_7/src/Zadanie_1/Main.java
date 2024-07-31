package Zadanie_1;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");

        dogBobik.run(150);
        dogBobik.swim(5);

        catMurzik.run(100);
        catMurzik.swim(5);

        Bowl bowl = new Bowl(15);

        Cat[] cats = {catMurzik, catBarsik};

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + cat.isSatiety());
        }

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
    }
}
