package theme3;

public class Constructor {
    public static void main(String[] args) {

        Product assortment = new Product("Tesla model 3" , 25000, true);

        System.out.print("Модель: " + assortment.getName() + "\n" + "Ціна: " + assortment.getPrice() + "\n" + "Наявність: " + assortment.getAvailability());
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

}

