//Створи власний виняток InvalidPriceException, який кидається, якщо ціна продукту менша або дорівнює нулю.
//Створи метод, який перевіряє ціну і кидає цей виняток при неправильному значенні.
//Перевір цей метод у main().

package theme4;

public class ProductValidator {

    public static void main (String[] args) {
        double price = -100 ;

        try {
            checkPrice(price);
            System.out.println("Ціна коректна");
        } catch (InvalidPriceException priceinvalid){
            System.out.println(priceinvalid.getMessage());
        }
    }
    public static void checkPrice(double price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("Ціна повинна бути більше нуля");
        }
    }
}

class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}
