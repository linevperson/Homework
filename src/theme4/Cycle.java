package theme4;

import java.util.ArrayList;

public class Cycle {

    public void printProducts() {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Tesla model 3", 25000, true));
        products.add(new Product("BMW M3", 53000, true));
        products.add(new Product("Toyota Camry", 32000, true));

        for (Product p : products) {
            System.out.println("Назва: " + p.getName() +
                    " Ціна: " + p.getPrice() +
                    " Наявність: " + p.isAvailable());
        }

    }

}
