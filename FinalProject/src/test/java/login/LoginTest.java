package login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownListPage;
import pages.HoversPage;
import pages.LoginPage;
import pages.SecureAreaPage;
import test.BaseTest;

public class LoginTest extends BaseTest {

    private WebDriver driver;

    @Test
    public void testLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.verifySuccessfulLogin();
        Assert.assertEquals(secureAreaPage.verifySuccessfulLogin(),"You logged into a secure area!\n" +
                "×");
    }
}