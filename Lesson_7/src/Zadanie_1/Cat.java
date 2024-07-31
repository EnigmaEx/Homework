package Zadanie_1;

public class Cat extends Animal {
    private boolean satiety;
    private static int catCount = 0;

    public Cat(String name) {
        super(name, 200, 0);
        this.satiety = false;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.satiety = true;
            System.out.println(name + " покушал и теперь сыт.");
        } else {
            System.out.println(name + " не смог покушать, недостаточно еды.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static int getCatCount() {
        return catCount;
    }
}