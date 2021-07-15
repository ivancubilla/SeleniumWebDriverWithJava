package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By linkTextDynamicLoading = By.linkText("Dynamic Loading");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicallyPage clickDynamicLoading(){
        driver.findElement(linkTextDynamicLoading).click();
        return new DynamicallyPage(driver);
    }
}
