package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By contextMenu = By.linkText("Context Menu");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public ContextMenuPage clickContextMenu(){
        driver.findElement(contextMenu).click();
        return new ContextMenuPage(driver);
    }
}
