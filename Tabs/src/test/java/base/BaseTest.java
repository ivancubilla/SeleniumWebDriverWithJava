package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.YoutubePage;

import java.util.ArrayList;

public class BaseTest {

    private WebDriver driver;
    private String urlPage = "http://the-internet.herokuapp.com/";
    protected HomePage homePage;
    protected YoutubePage youtubePage;
    public ArrayList<String> tabs;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(urlPage);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        youtubePage = new YoutubePage(driver);

        // Open new window
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        String googleWindows = "window.open('https://www.google.com/')";
        javascriptExecutor.executeScript(googleWindows);

        // Open some news windows
        tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0)).navigate().to("https://www.youtube.com/channel/UCEkFLdU_oM4gPfb6U7AZAFA");


    }


    @AfterMethod
    public void tearDown(){
        driver.switchTo().window(tabs.get(0)).close();
        driver.switchTo().window(tabs.get(1)).close();
    }
}
