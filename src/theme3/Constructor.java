package theme3;

public class Constructor {
    public static void main(String[] args) {

        Product assortmentTesla = new Product("Tesla model 3" , 25000, true);
        Product assortmentBMW = new Product("BMW M3" , 53000, true);
        DiscountedProduct discount15 = new DiscountedProduct("Tesla model 3" , 25000, true , 15);

        assortmentTesla.printProductInfo();
        assortmentBMW.printProductInfo();

        // TODO(1): Зараз ти викликаєш getDiscount(), але метод повертає ЦІНУ зі знижкою.
        // Це плутає. Треба:
        // - getDiscount() -> повертає відсоток знижки (15)
        // - getDiscountedPrice() -> повертає нову ціну

        System.out.println( "Ціна Tesla model 3 зі знижкою: " + discount15.getDiscount() );

    }
}
// TODO(2): Product краще винести в окремий файл Product.java (і зробити public class Product)
class Product {
    private String name;
    private double price;
    private boolean availability;

    public Product(String name , double price , boolean availability){
        // TODO(3): Додай валідацію в конструкторі або викликай сеттери.
        // Наприклад: якщо name null/empty -> exception, якщо price < 0 -> exception
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public void setName(String name) { this.name = name; }
    // TODO(3): Додай валідацію в конструкторі або викликай сеттери.
    // Наприклад: якщо name null/empty -> exception, якщо price < 0 -> exception
    public String getName() { return name; }

    public void setPrice(double price) { this.price = price; }
    // TODO(5): Додай валідацію: price не може бути < 0
    public double getPrice() { return price; }

    public void setAvailability(boolean availability) { this.availability = availability; }

    public boolean getAvailability() { return availability; }
    // TODO(6): Для boolean getter за Java-конвенцією краще isAvailable() або isInStock()
    public void printProductInfo() {
        // TODO(7): Булеве значення буде true/false.
        // Краще зробити читабельніше: "В наявності" / "Немає"
        System.out.println("Модель: " + name);
        System.out.println("Ціна: " + price);
        System.out.println("Наявність: " + availability);
    }

}
// TODO(8): DiscountedProduct краще винести в окремий файл DiscountedProduct.java (public class DiscountedProduct)
class DiscountedProduct extends Product {
    // TODO(9): Поле має бути private (інкапсуляція)
    public double discount;

    public DiscountedProduct (String name , double price , boolean availability , double discount) {
        super(name , price , availability);
        // TODO(10): Валідуй discount: 0..100 (інакше може бути мінусова ціна)
        this.discount = discount ;
    }
    // TODO(11): Цей метод має повертати discount (відсоток), а не ціну.
    // Перейменуй метод на getDiscountedPrice() і створи окремий getDiscount()
    public double getDiscount () {
        return getPrice() - (getPrice() * discount / 100);
    }

}