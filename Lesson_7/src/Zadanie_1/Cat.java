package Zadanie_1;

public class Cat extends Animal {
    private boolean isHungry;

    public Cat(String name) {
        super(name, 200, 0); // Коты не умеют плавать
        isHungry = true;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            isHungry = false;
            System.out.println(name + " покушал и теперь сыт.");
        } else {
            System.out.println(name + " не смог покушать. В миске недостаточно еды.");
        }
    }
}