package login;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;


public class TestsLogin extends TestBase {

    @Test
    public void testSuccesfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureArea = loginPage.clickButtonLogin();
        Assert.assertTrue(secureArea.assertTextSecureArea().contains("You logged into a secure area!"),"Area incorrect!!!!!!!!!!");
    }
}