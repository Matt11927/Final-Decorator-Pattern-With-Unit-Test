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


}
