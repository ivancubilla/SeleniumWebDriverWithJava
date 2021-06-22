package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    //constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    // method click
    public void clickLinkText(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    public LoginPage clickFormAuthentication() {
        clickLinkText("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownListPage clickDropdown(){
        clickLinkText("Dropdown");
        return new DropdownListPage(driver);
    }
    public HoversPage clickHovers(){
        clickLinkText("Hovers");
        return new HoversPage(driver);
    }
}


