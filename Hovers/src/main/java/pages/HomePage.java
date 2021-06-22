package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By Hovers= By.linkText("Hovers");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HoverPage clickHovers(){
        driver.findElement(Hovers).click();
        return new HoverPage(driver);
    }
}
