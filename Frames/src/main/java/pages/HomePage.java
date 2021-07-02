package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By wysiwgeEditor = By.linkText("WYSIWYG Editor");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WysiwygEditorPage clickWysiwygEditor(){
        driver.findElement(wysiwgeEditor).click();
        return new WysiwygEditorPage(driver);
    }
}
