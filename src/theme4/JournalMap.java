//Створи словник (HashMap), де ключ — це назва продукту, а значення — його ціна.
//Додай вивід всіх пар ключ-значення у консоль.

package theme4;

import java.util.HashMap;
import java.util.Map;

public class JournalMap {
    public static void main (String[] args) {
        HashMap<String , Integer> products = new HashMap<>();

        products.put("Tesla model 3" , 25000);
        products.put("BMW M3" , 67000);
        products.put("Audi RS5" , 63000);

        for (Map.Entry<String , Integer> pairs: products.entrySet()) {
            System.out.println(pairs.getKey() + " - " + pairs.getValue());
        }
    }
}
