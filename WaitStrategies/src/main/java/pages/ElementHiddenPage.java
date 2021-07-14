package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementHiddenPage {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By finishTextResult = By.id("finish");

    public ElementHiddenPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.invisibilityOf(
        driver.findElement(loading)));

        /*FluentWait fluentWait = new FluentWait(driver)*/
    }

    public String textResult(){
        return driver.findElement(finishTextResult).getText();
    }
}
