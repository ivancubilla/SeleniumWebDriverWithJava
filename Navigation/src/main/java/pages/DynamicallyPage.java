package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicallyPage {

    private WebDriver driver;
    private By example1Link = By.linkText("Example 1: Element on page that is hidden");

    public DynamicallyPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page clickExample1(){
        driver.findElement(example1Link).click();
        return new Example1Page(driver);
    }
}
