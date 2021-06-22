package keys;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeysTest extends BaseTest{


    @Test
    public void keysBackSpace(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
    }
}
