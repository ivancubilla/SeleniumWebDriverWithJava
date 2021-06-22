package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {

    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By viewProfile = By.xpath("//*[@id=\"content\"]/div/div[1]/div/a");
    private By resultText = By.xpath("/html/body/h1");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hoverOverFigure(int index){
        WebElement element = driver.findElements(figureBox).get(index - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    public void clickViewprofile(){
        driver.findElement(viewProfile).click();
    }
    public String getResult(){
        return  driver.findElement(resultText).getText();
    }
}