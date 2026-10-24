package FoodToppings;

import Resturant.FoodItem;
import Resturant.MealDecorator;

public class Onions extends MealDecorator {
    public Onions(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return 0;
    }
}
