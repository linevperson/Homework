package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @DataProvider(name = "loginData")
    public Object [][] loginData () {
        return new Object[][] {
                {"standard_user", "secret_sauce" , null},
                {"locked_out_user", "secret_sauce" , "Locked user"},
                {"problem_user", "secret_sauce" , null},
                {"error_user", "secret_sauce" , null},
                {"fake_user" , "fake_password" , "Fake user"}
        };
    }

    @Test (dataProvider = "loginData")
    public void testSuccessfulLogin(String user ,String pass ,String errorMessage) {
        loginPage.open();
        loginPage.typeUsername(user);
        loginPage.typePassword(pass);
        loginPage.clickLogin();

        if (errorMessage == null) {
            Assert.assertEquals(driver.getCurrentUrl() ,"https://www.saucedemo.com/inventory.html");
        } else {
            String actualError = loginPage.errorMessage();
            Assert.assertEquals(actualError,errorMessage , "Текст помилки не співпав");
        }
    }

    @AfterMethod
    public void closeTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}