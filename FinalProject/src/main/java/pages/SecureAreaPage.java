package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By textSecureArea = By.id("flash");

    // constructor
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    //verify the successful login
    public String verifySuccessfulLogin() {
        return driver.findElement(textSecureArea).getText();
    }
    public void backPage(){
        driver.navigate().back();
    }
}