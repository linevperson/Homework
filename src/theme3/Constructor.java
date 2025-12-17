package theme3;

public class Constructor {
    public static void main(String[] args) {

        Product assortmentTesla = new Product("Tesla model 3" , 25000, true);
        Product assortmentBMW = new Product("BMW M3" , 53000, true);
        DiscountedProduct discount15 = new DiscountedProduct("Tesla model 3" , 25000, true , 15);

        assortmentTesla.printProductInfo();
        assortmentBMW.printProductInfo();

        System.out.println( "Ціна Tesla model 3 зі знижкою: " + discount15.getDiscount() );

    }
}

class Product {
    private String name;
    private double price;
    private boolean availability;

    public Product(String name , double price , boolean availability){
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public void setName(String name) { this.name = name; }

    public String getName() {return name;}

    public void setPrice(double price) { this.price = price; }

    public double getPrice() { return price; }

    public void setAvailability(boolean availability) { this.availability = availability; }

    public boolean getAvailability() { return availability; }

    public void printProductInfo() {
        System.out.println("Модель: " + name);
        System.out.println("Ціна: " + price);
        System.out.println("Наявність: " + availability);
    }

}

class DiscountedProduct extends Product {
    public double discount;

    public DiscountedProduct (String name , double price , boolean availability , double discount) {
        super(name , price , availability);
        this.discount = discount ;
    }
    public double getDiscount () {
        return getPrice() - (getPrice() * discount / 100);
    }

}