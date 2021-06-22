package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{

    private WebDriver driver;
    private By dropDown = By.linkText("Dropdown");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public DropdownList clickDropdown(){
        driver.findElement(dropDown).click();
        return new DropdownList(driver);
    }
}