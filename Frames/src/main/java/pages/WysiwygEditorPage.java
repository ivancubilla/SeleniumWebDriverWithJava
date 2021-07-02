package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String iFrameEditor = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseButton = By.cssSelector("button[class='tox-tbtn'][title='Increase indent']");

    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clearFrame(){
        switchToEditor();
        driver.findElement(textArea).clear();
        switchToMainEditor();
    }

    public void setText(String textEditorFrame){
        switchToEditor();
        driver.findElement(textArea).sendKeys(textEditorFrame);
        switchToMainEditor();
    }
    public void clickButtonIncreaseIndent(){
        driver.findElement(increaseButton).click();
    }



    private void switchToEditor(){
        driver.switchTo().frame(iFrameEditor);
    }
    private void switchToMainEditor(){
        driver.switchTo().parentFrame();
    }
}
