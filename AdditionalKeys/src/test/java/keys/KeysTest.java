package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeysTest extends BaseTest{


    @Test
    public void keysBackSpace(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.inputKey("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPressesPage.textResult(), "You entered: BACK_SPACE");
    }
}
