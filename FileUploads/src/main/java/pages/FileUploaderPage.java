package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage {

    private WebDriver driver;
    private By selectFileButton = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By textUpload = By.id("content");

    public FileUploaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadSubmit(){
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String uploadFile){
        driver.findElement(selectFileButton).sendKeys(uploadFile);
        uploadSubmit();
    }

    public void successfullUpload(){
        System.out.println(driver.findElement(textUpload).getText());
    }
}
