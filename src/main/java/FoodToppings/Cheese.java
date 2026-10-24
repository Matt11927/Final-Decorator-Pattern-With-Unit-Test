package FoodToppings;

import Resturant.FoodItem;
import Resturant.MealDecorator;

public class Cheese extends MealDecorator {

    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return 0;
    }
}
