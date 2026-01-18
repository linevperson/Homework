//Реалізуй DataProvider, щоб передати кілька пар логін/пароль:
//Створи тест, який для кожної пари вводить ці дані і виводить їх у консоль (поки без реальної авторизації).

package theme3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTests4 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @DataProvider (name = "loginData")
    public Object [][] loginData () {
        return new Object[][] {
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"error_user", "secret_sauce"},
        };
    }

    @Test (dataProvider = "loginData")
    public void LoginTest(String username , String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        System.out.println("Вхід в систему за допомогую данних: " +
                "Login: " + username +
                " Password: " + password );

    }

    @AfterMethod
    public void closeTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}
