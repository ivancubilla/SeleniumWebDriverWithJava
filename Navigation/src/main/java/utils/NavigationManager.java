package utils;

import org.openqa.selenium.WebDriver;

public class NavigationManager {

    private WebDriver driver;

    public NavigationManager(WebDriver driver) {
        this.driver = driver;
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        driver.navigate().forward();
    }

    public void refreshPage(){
        driver.navigate().refresh();
    }

    public void navigateUrl (String urlPage){
        driver.navigate().to(urlPage);
    }
}
