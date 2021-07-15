package tabs;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TabsTest extends BaseTest {

    private WebDriver driver;

    @Test
    public void assertCorrectTabTest(){
        Assert.assertEquals(youtubePage.getTitle(),"Mundo Code - YouTube");
    }
}
