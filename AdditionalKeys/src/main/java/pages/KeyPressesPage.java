package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By formKeyPresses = By.id("target");
    private By resultBackSpace = By.id("result");

    public KeyPressesPage (WebDriver driver){
        this.driver = driver;
    }

    public void inputKey(String text){
        driver.findElement(formKeyPresses).sendKeys(text);
    }
    public String textResult(){
        return driver.findElement(resultBackSpace).getText();
    }
}
