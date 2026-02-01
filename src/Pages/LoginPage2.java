//Використай PageFactory для ініціалізації елементів.

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
    WebDriver driver;

    @FindBy (id = "user-name")
    private WebElement username;

    @FindBy (id = "password")
    private WebElement password;

    @FindBy (id = "login-button")
    private WebElement loginButton;

    public LoginPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver ,this); //в мене э питання тут по this,ніяк не можу зрозуміти чому я не можу вказати просто driver.
    }

    public void open () {
        driver.get("https://www.saucedemo.com/");
    }
    public void typeUsername (String user) {
        username.sendKeys(user);
    }
    public void typePassword (String pass) {
        password.sendKeys(pass);
    }
    public void clickLogin () {
        loginButton.click();
    }
}
