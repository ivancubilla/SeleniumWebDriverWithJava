package login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import base.test.BaseTest;

public class LoginTest extends BaseTest {

    private WebDriver driver;

    @Test
    public void testLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.cleanField();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.verifySuccessfulLogin();
        Assert.assertEquals(secureAreaPage.verifySuccessfulLogin(),"You logged into a secure area!\n" +
                "×");
    }
}