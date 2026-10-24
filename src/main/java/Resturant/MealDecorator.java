package Resturant;

public abstract class MealDecorator implements FoodItem {
    protected FoodItem foodItem;

    public MealDecorator(FoodItem foodItem) {
        this.foodItem = foodItem;
    }
}
