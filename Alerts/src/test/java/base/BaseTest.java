package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class BaseTest {

    private WebDriver driver;
    private String urlPage = "http://the-internet.herokuapp.com/";
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(urlPage);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}