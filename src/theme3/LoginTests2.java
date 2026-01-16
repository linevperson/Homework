//Додай assert, щоб перевірити, що заголовок сторінки містить "Swag Labs".

package theme3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTests2 {

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

        Assert.assertEquals(title, "Swag Labs", "Заголовок сторінки не збігається!");

        System.out.println("Тест успішний!");
        }



    @AfterMethod
    public void closetest () {
        if (driver != null) {
        driver.quit();
    }
    System.out.println("Браузер закрито.");
    }
}