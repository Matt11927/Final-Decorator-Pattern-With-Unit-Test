import FoodToppings.Cheese;
import FoodToppings.Ketchup;
import FoodToppings.Onions;
import Resturant.Burger;
import Resturant.FoodItem;
import Resturant.Fries;
import Resturant.HotDog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestFoodPricing {

    @Test
    public void testBurgerCost(){
        FoodItem burger = new Burger();
        double actual = burger.getCost();
        double expected = 2.89;
        assertEquals(expected,actual);
    }

    @Test
    public void testBurgerWithKetchupCost(){
        FoodItem burger = new Ketchup( new Burger());
        double actual = burger.getCost();
        double expected = 2.95; // 2.89+0.06 == 2.95
        assertEquals(expected,actual);
    }

    @Test
    public void testBurgerWithCheeseCost(){
        FoodItem burger = new Cheese( new Burger());
        double actual = burger.getCost();
        double expected = 4.39; // 2.89+1.50 == 4.39
        assertEquals(expected,actual, 0.001); //fix rounding
    }


}
