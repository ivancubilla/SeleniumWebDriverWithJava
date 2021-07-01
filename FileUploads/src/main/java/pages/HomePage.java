package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By fileUploads = By.linkText("File Upload");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public FileUploaderPage clickFileUploads(){
        driver.findElement(fileUploads).click();
        return new FileUploaderPage(driver);
    }

}
