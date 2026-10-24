package Customer;

public class LoyalCustomer {

    private double productDiscount;

    public LoyalCustomer(double productDiscount) {
        this.productDiscount = productDiscount;
    }

    public double applyDiscount(double totalCost) {
        return totalCost - (totalCost * productDiscount);
    }
}
