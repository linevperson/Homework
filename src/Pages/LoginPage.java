//Створи в ньому клас LoginPage,
//у якому опиши елементи сторінки входу https://www.saucedemo.com/:
//Поле логіну
//Поле паролю
//Кнопку входу
//Додай до LoginPage методи для:
//Заповнення логіну
//Заповнення паролю
//Натискання кнопки "Login"

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

        By username = By.id("user-name");
        By password = By.id("password");
        By loginbutton = By.id("login-button");
        By error = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open () {
            driver.get("https://www.saucedemo.com/");
    }
    public void typeUsername (String user) {
            driver.findElement(username).sendKeys(user);
    }
    public void typePassword (String pass) {
            driver.findElement(password).sendKeys(pass);
    }
    public void clickLogin () {
            driver.findElement(loginbutton).click();
    }

    public String errorMessage () {
        return driver.findElement(error).getText();
    }

}
