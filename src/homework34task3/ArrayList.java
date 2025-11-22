//Створи список (ArrayList) з трьома містами.
// Додай ще одне місто до списку і виведи весь список у консоль.

package homework34task3;

import java.util.List;

public class ArrayList {
    public static void main (String[] args) {
        java.util.ArrayList<String> cities = new java.util.ArrayList<>(List.of("Київ","Харків" ,"Одеса" ));//TODO список має бути одразу з 3ма містами - використай List.of і потім додай ще одне місто через add
        cities.add("Львів"); //Додав четверте місто
        for (String city : cities) {                                                   //TODO тут виведи кожен елемент списку окремо (використовуй цикл)
            System.out.println(city);
        }

    }

}         //В свій захист скажу,що в матеріалі не бачив прикладів з list of.А в завданні не було вказано,що потрібно міста вивести окремо)
