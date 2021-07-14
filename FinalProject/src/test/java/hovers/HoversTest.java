package hovers;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;
import base.test.BaseTest;

public class HoversTest extends BaseTest {

    @Test
    public void testHovers(){
        HoversPage hoversPage = homePage.clickHovers();
        hoversPage.hoverOver(1);
        hoversPage.clickViewProfile();
        Assert.assertEquals(hoversPage.verifySuccessHovers(),"Not Found");
    }
}
