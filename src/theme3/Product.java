package theme3;

public class Product {

    private String name;
    private double price;
    private boolean availability;

    public Product(String name, double price, boolean availability) {
        setName(name);
        setPrice(price);
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Ім'я не може бути пустим");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Ціна не може бути негативною");
        }
        this.price = price;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void printProductInfo() {
        String availabilityText = availability ? "В наявності" : "Немає";

        System.out.println("Модель: " + name);
        System.out.println("Ціна: " + price);
        System.out.println(availabilityText);
    }

}
