package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By dynamicLoadingLink = By.linkText("Dynamic Loading");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicallyLoadedPage clickDynamicLoading(){
        driver.findElement(dynamicLoadingLink).click();
        return new DynamicallyLoadedPage(driver);
    }
}
