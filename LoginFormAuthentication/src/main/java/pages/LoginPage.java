package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By buttonLogin = By.className("radius");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setUserName(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickButtonLogin(){
        driver.findElement(buttonLogin).click();
        return new SecureAreaPage(driver);
    }
}