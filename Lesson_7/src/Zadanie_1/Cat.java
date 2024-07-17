package Zadanie_1;

public class Cat extends Animal {
    private boolean isFull;

    public Cat(String name) {
        super(name, 200, 0);
        this.isFull = false;
        catCount++;
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.getFood() >= amount) {
            bowl.decreaseFood(amount);
            this.isFull = true;
            System.out.println(name + " сытый.");
        } else {
            System.out.println(name + " в миске мало еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}