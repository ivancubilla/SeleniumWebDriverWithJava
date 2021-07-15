package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YoutubePage {

    private WebDriver driver;

    public YoutubePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
