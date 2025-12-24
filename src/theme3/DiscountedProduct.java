package theme3;

public class DiscountedProduct extends Product {

    private double discount;

    public DiscountedProduct(String name, double price, boolean availability, double discount) {
        super(name, price, availability);
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Знижка повинна бути від 0 до 100");
        }
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public double getDiscountedPrice() {
        return getPrice() - (getPrice() * discount / 100);
    }
}

