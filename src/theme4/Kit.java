//Створи набір (HashSet) з унікальними назвами категорій товарів
// (наприклад, "Електроніка", "Одяг", "Побутова техніка")
// і перевір, чи міститься в ньому певна категорія.

package theme4;

import java.util.HashSet;
import java.util.Set;

public class Kit {
    public static void main (String[] args) {
        CategoryChecker checker = new CategoryChecker();
        boolean check = checker.checkCategory("Одяг");
        System.out.println(check);

    }
}

class CategoryChecker {

    public boolean checkCategory(String category) {
        Set<String> categories = new HashSet<>();

        categories.add("Електроніка");
        categories.add("Одяг");
        categories.add("Побутова техніка");

        return categories.contains(category);


    }
}

