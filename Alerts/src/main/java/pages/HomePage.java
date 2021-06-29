package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By alertJavascript = By.linkText("JavaScript Alerts");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public AlertsPage clickJavaScriptAlerts(){
        driver.findElement(alertJavascript).click();
        return new AlertsPage(driver);
    }
}