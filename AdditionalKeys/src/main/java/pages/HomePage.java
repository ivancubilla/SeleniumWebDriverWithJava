package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{

    private WebDriver driver;
    private By keyPresses = By.linkText("Key Presses");

    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public KeyPressesPage clickKeyPresses(){
        driver.findElement(keyPresses).click();
        return new KeyPressesPage(driver);
    }
}
