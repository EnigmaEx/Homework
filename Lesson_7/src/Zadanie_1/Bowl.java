package Zadanie_1;

public class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        this.foodAmount = Math.max(initialFood, 0);
    }

    public boolean decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}