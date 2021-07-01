package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By boxContextMenu = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void modalsClickRight(){
        WebElement element = driver.findElement(boxContextMenu);
        Actions actions = new Actions(driver);
        actions.contextClick(element).sendKeys(Keys.ARROW_LEFT).perform();
    }

    public void acceptModals(){
        driver.switchTo().alert().accept();
    }
}
