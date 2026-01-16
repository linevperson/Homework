//Додай перевірку, що заголовок сторінки містить слово "Swag Labs".
// Виведи результат у консоль.

package theme1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main (String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        String title = driver.getTitle();

        assert title != null; //тут мені видало лампочку,що може бути помилка на contains.Вирішив довіритись і додав цю строчку.Не треба було?)
        //TODO IntelliJ попереджає про можливий null, але в Selenium getTitle() фактично завжди повертає рядок, тому assert title != null тут зайвий і не має реальної користі в тесті
        if (title.contains("Swag Labs")) { //або можна було написати title.equals для 100% співпадіння.Правильно розумію?
            //TODO так, equals це 100% співпадіння
            System.out.println("Тест успішний!");
        } else {
            System.out.println("Тест не пройдено!");
        }

        driver.quit();
    }
}
