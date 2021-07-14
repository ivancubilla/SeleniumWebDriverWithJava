package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicallyLoadedPage {

    private WebDriver driver;
    private By example1Link = By.linkText("Example 1: Element on page that is hidden");

    public DynamicallyLoadedPage(WebDriver driver) {
        this.driver = driver;
    }

    public ElementHiddenPage clickExample1(){
        driver.findElement(example1Link).click();
        return new ElementHiddenPage(driver);
    }
}
