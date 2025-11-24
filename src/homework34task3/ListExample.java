package homework34task3;

import java.util.List;
import java.util.ArrayList;// тут імпортував пакет

public class ListExample {// змінив назву що не виникало конфлікту

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>(List.of("Київ", "Харків", "Одеса"));

        cities.add("Львів");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}

//TODO вніс правки - подивись і проаналізуй (ти використовував повністю прописаний пакет java.util.ArrayList, замість імпорту)