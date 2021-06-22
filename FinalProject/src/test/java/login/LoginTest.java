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
    @Test
    public void testDropDown(){
        DropdownListPage dropdownListPage = homePage.clickDropdown();
        dropdownListPage.dropdownByIndex(1);
        dropdownListPage.dropdownByName("Option 2");
        dropdownListPage.dropdownByValue(2);
    }
    @Test
    public void testHovers(){
        HoversPage hoversPage = homePage.clickHovers();
        hoversPage.hoverOver(1);
        hoversPage.clickViewProfile();
        Assert.assertEquals(hoversPage.verifySuccessHovers(),"Not Found");
    }
}