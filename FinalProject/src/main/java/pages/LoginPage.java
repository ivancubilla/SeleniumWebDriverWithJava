package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.className("radius");

    // constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void cleanField(){
        driver.findElement(username).clear(); // clear the field username
        driver.findElement(password).clear(); // clear the field password
    }

    public void setUserName(String fieldUsername) {
        driver.findElement(username).sendKeys(fieldUsername); // complete the field username
    }

    public void setPassword(String fieldPassword) {
        driver.findElement(password).sendKeys(fieldPassword); // complete the field password
    }

    public SecureAreaPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
