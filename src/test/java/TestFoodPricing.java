import Resturant.*;
import FoodToppings.*;
import Customer.*;

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

    @Test
    public void testBurgerWithOnionsCost(){
        FoodItem burger = new Onions( new Burger());
        double actual = burger.getCost();
        double expected = 5.08; // 2.89+2.19 == 4.39
        assertEquals(expected,actual, 0.001); //fix rounding
    }

    @Test
    public void testFriesWithKetchupCost(){
        FoodItem fries = new Ketchup( new Fries());
        double actual = fries.getCost();
        double expected = 1.18; // 1.12+0.06 == 1.18
        assertEquals(expected,actual, 0.001);
    }

    @Test
    public void testFriesWithCheeseCost(){
        FoodItem fries = new Cheese( new Fries());
        double actual = fries.getCost();
        double expected = 2.62; // 1.12+1.50 == 2.62
        assertEquals(expected,actual);
    }

    @Test
    public void testFriesWithOnionsCost(){
        FoodItem onion = new Onions( new Fries());
        double actual = onion.getCost();
        double expected = 3.31; // 1.12+2.19== 3.31
        assertEquals(expected,actual, 0.001);
    }

    @Test
    public void testHotDogWithKetchupCost(){
        FoodItem hotDog = new Ketchup( new HotDog());
        double actual = hotDog.getCost();
        double expected = 1.56; // 1.50+0.06 == 1.56
        assertEquals(expected,actual);
    }

    @Test
    public void testHotDogWithCheeseCost(){
        FoodItem hotDog = new Cheese( new HotDog());
        double actual = hotDog.getCost();
        double expected = 3; // 1.50+1.50 == 3
        assertEquals(expected,actual, 0.001); //fix rounding
    }

    @Test
    public void testHotDogWithOnionsCost(){
        FoodItem hotDog = new Onions( new HotDog());
        double actual = hotDog.getCost();
        double expected = 3.69; // 1.50+2.19 == 3.69
        assertEquals(expected,actual, 0.001); //fix rounding
    }

    @Test
    public void testOrderTotalBurgerFriesCost(){

        CustomerOrder order = new CustomerOrder();

        order.addItem(new Burger());
        order.addItem(new Fries());

        double expected = 4.01; //2.89+1.12
        double actual = order.calculateTotal();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testOrderWithToppings(){

        CustomerOrder order = new CustomerOrder();
        FoodItem burger = new Cheese(new Ketchup(new Burger()));

        order.addItem(burger);

        double expected = 4.45; //1.50+0.06+2.89
        double actual = order.calculateTotal();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCustomerDiscountWithBurger() {
        FoodItem burger = new Burger();
        double burgerPrice = burger.getCost();
        LoyalCustomer loyalCustomer = new LoyalCustomer(0.25);
        double actual = loyalCustomer.applyDiscount(burgerPrice);
        double expected = 2.1675;
        assertEquals(expected, actual, 0.001);
    }


}
