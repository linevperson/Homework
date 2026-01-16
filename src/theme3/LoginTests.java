//Створи новий клас LoginTests, використовуючи анотації TestNG:
//@BeforeMethod — для відкриття браузера і переходу на Swag Labs
//@AfterMethod — для закриття браузера після тесту
//@Test — для написання одного тесту на перевірку назви сторінки

package theme3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println("Браузер відкрито.Сайт Swag Labs відкрито.");
    }

    @Test
    public void checkTitle () {
        String title = driver.getTitle();

        if (title.contains("Swag Labs")) {
            System.out.println("Тест успішний!");
        } else {
            System.out.println("Тест не пройдено!");
        }

    }

    @AfterMethod
    public void closetest () {
        driver.quit();
        System.out.println("Браузер закрито.");
    }
}

