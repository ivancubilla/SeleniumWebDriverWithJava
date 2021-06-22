package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListPage {

    private WebDriver driver;
    private By selectDropdown = By.id("dropdown");

    public DropdownListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dropdownByIndex(int indexDropdown){
        Select select = new Select(driver.findElement(selectDropdown));
        select.selectByIndex(indexDropdown);
    }
    public void dropdownByName(String nameDropdown){
        Select select = new Select(driver.findElement(selectDropdown));
        select.selectByVisibleText(nameDropdown);
    }
    public void dropdownByValue(int valueDropdown){
        Select select = new Select(driver.findElement(selectDropdown));
        select.selectByValue(Integer.toString(valueDropdown));
    }

}
