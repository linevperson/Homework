//Додай у свій клас LoginTest перевірки наявності цих елементів на сторінці через Selenium
// і виведи повідомлення в консоль, якщо елемент знайдено.

package theme2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class LoginTest2 {
    public static void main (String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // ID
        if (driver.findElements(By.id("login-button")).size() > 0) {
            System.out.println("Тест пройдено!");
        } else {
            System.out.println("Тест не пройдено!");
        }

        // ClassName
        if (driver.findElements(By.className("submit-button")).size() > 0) {
            System.out.println("Тест пройдено!");
        } else {
            System.out.println("Тест не пройдено!");
        }

        // XPath
        if (driver.findElements(By.xpath("//input[@id='login-button']")).size() > 0) {
            System.out.println("Тест пройдено!");
        } else {
            System.out.println("Тест не пройдено!");
        }

        // CSS Selector
        if (driver.findElements(By.cssSelector("#login-button")).size() > 0) {
            System.out.println("Тест пройдено!");
        } else {
            System.out.println("Тест не пройдено!");
        }

        driver.quit();
    }
}
