package FoodToppings;
import Resturant.FoodItem;
import Resturant.MealDecorator;

public class Ketchup extends MealDecorator {

    public Ketchup(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return 0;
    }
}
