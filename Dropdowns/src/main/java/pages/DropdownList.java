package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownList {

    private WebDriver driver;
    private By selectDropDown = By.id("dropdown");

    public DropdownList(WebDriver driver) {
        this.driver = driver;
    }

    //DropDown by value
    public void selectValue(int byValue){
        Select selectOptionValue = new Select(driver.findElement(selectDropDown));
        selectOptionValue.selectByValue(Integer.toString(byValue));
    }

    //DropDown by index
    public void selectIndex (int byIndex){
        Select selectOptionIndex = new Select(driver.findElement(selectDropDown));
        selectOptionIndex.selectByIndex(byIndex);
    }

    //DropDown by name
    public void selectName (String dropName){
        Select selectOptionName = new Select(driver.findElement(selectDropDown));
        selectOptionName.selectByVisibleText(dropName);
    }
    //Verification
    public void assertTitle(){
        Assert.assertEquals("The Internet",driver.getTitle());
    }
}