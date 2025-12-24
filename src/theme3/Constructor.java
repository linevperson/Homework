package theme3;

public class Constructor {
    public static void main(String[] args) {

        Product assortmentTesla = new Product("Tesla model 3" , 25000, true);
        Product assortmentBMW = new Product("BMW M3" , 53000, true);
        DiscountedProduct discount15 = new DiscountedProduct("Tesla model 3" , 25000, true , 15);

        assortmentTesla.printProductInfo();
        assortmentBMW.printProductInfo();

        System.out.println( "Знижка для Tesla: " + discount15.getDiscount() + "\n" + "Нова ціна Tesla: " + discount15.getDiscountedPrice());
    }
}


















// TODO(1): Зараз ти викликаєш getDiscount(), але метод повертає ЦІНУ зі знижкою.
// Це плутає. Треба:
// - getDiscount() -> повертає відсоток знижки (15)
// - getDiscountedPrice() -> повертає нову ціну
// TODO(2): Product краще винести в окремий файл Product.java (і зробити public class Product)
// TODO(3): Додай валідацію в конструкторі або викликай сеттери.
// TODO(3): Додай валідацію в конструкторі або викликай сеттери.
// Наприклад: якщо name null/empty -> exception, якщо price < 0 -> exception
// Наприклад: якщо name null/empty -> exception, якщо price < 0 -> exception
// TODO(8): DiscountedProduct краще винести в окремий файл DiscountedProduct.java (public class DiscountedProduct)
    // TODO(9): Поле має бути private (інкапсуляція)
        // TODO(10): Валідуй discount: 0..100 (інакше може бути мінусова ціна)
    // TODO(11): Цей метод має повертати discount (відсоток), а не ціну.
    // Перейменуй метод на getDiscountedPrice() і створи окремий getDiscount()
// TODO(6): Для boolean getter за Java-конвенцією краще isAvailable() або isInStock()
// TODO(7): Булеве значення буде true/false.
// Краще зробити читабельніше: "В наявності" / "Немає"