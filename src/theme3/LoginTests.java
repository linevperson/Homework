//Створи новий клас LoginTests, використовуючи анотації TestNG:
//@BeforeMethod — для відкриття браузера і переходу на Swag Labs
//@AfterMethod — для закриття браузера після тесту
//@Test — для написання одного тесту на перевірку назви сторінки

package theme3;

import Pages.LoginPage;
import Pages.LoginPage2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests {

    WebDriver driver;
    LoginPage2 loginPage2;

    @BeforeMethod
    public void setUp () {
        driver = new ChromeDriver();
        loginPage2 = new LoginPage2(driver);
        loginPage2.open();
        System.out.println("Браузер відкрито.Сайт Swag Labs відкрито.");
    }

    @Test
    public void checkTitle () {

        loginPage2.typeUsername("standard_user");
        loginPage2.typePassword("secret_sauce");
        loginPage2.clickLogin();

        System.out.println("Логін виконано!");

    }

    @AfterMethod
    public void closeTest() {
        if (driver != null) {
            driver.quit();
            System.out.println("Браузер закрито.");
        }
    }
}

