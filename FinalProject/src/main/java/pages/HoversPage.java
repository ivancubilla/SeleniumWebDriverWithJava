package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver driver;
    private By hover = By.className("figure");
    private By viewProfile = By.linkText("View profile");
    private By textViewProfile = By.xpath("/html/body/h1");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOver(int index){
        WebElement element = driver.findElements(hover).get(index -1);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    public void clickViewProfile(){
        driver.findElement(viewProfile).click();
    }
    public String verifySuccessHovers() {
        return driver.findElement(textViewProfile).getText();
    }
}