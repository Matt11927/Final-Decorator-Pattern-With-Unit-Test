import FoodToppings.*;
import Resturant.*;
import Customer.*;

public class Main {

    public static void main(String[] args){

        FoodItem burger = new Onions(new Cheese(new Ketchup(new Burger())));

        FoodItem fries = new Cheese(new Fries());

        FoodItem hotdog = new Onions(new Ketchup(new HotDog()));

        CustomerOrder order = new CustomerOrder();

        order.addItem(burger);
        order.addItem(hotdog);
        order.addItem(fries);

        System.out.printf("Burger with toppings of Onions, Cheese, and Ketchup: $%.2f%n",
                burger.getCost());

        System.out.printf("HotDog with toppings of Onions and Ketchup: $%.2f%n",
                hotdog.getCost());

        System.out.printf("Fries with toppings of Cheese: $%.2f%n",
                fries.getCost());

        double total = order.calculateTotal();

        System.out.printf("%nBefore Loyalty Discount: $%.2f%n",
                total);

        LoyalCustomer loyalCustomer =
                new LoyalCustomer(0.25);

        double discountedTotal =
                loyalCustomer.applyDiscount(total);

        System.out.printf("After Loyalty Discount (25%%): $%.2f%n",
                discountedTotal);
    }
}