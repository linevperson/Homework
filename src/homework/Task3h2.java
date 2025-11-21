//Створи список (ArrayList) з трьома містами.
// Додай ще одне місто до списку і виведи весь список у консоль.

package homework;

import java.util.ArrayList;

public class Task3h2 {
    public static void main (String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Київ");
        cities.add("Харків");
        cities.add("Одеса");
        cities.add("Львів"); //Додав четверте місто
        System.out.print(cities);

    }

}
