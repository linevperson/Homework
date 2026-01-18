//Додай SoftAssert, щоб додатково перевірити наявність поля логіну і паролю, але не переривати тест при першій помилці.

package theme3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginTests3 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void checkPageElemetns() {

        SoftAssert softAssert = new SoftAssert();

        String title = driver.getTitle();
        Assert.assertEquals(title,"Swag Labs", "Заголовок не збігається!");

        boolean login = driver.findElement(By.id("user-name")).isDisplayed();
        softAssert.assertTrue(login , "Логін не знайдено.");

        boolean password = driver.findElement(By.id("passwor")).isDisplayed();
        softAssert.assertTrue(password , "Пароль не знайдено."); //А чому коли тест падає,в консолі не видає "Пароль не знайдено" ?

        softAssert.assertAll();

        System.out.println("Всі елементи перевірено.");
    }
    @AfterMethod
    public void closeTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}

