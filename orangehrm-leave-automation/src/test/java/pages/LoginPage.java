package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By username = By.name("username");
    private By password = By.name("password");
    private By loginBtn = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void login() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(username))
                .sendKeys("Admin");
        driver.findElement(password)
                .sendKeys("S4b@W@s9cTL@");
        driver.findElement(loginBtn).click();
    }
}
