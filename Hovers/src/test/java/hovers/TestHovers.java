package hovers;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoverPage;

public class TestHovers extends TestBase {

    @Test
    public void testHovers(){
        HoverPage hoverPage = homePage.clickHovers();
        hoverPage.hoverOverFigure(1);
        hoverPage.clickViewprofile();
        Assert.assertEquals(hoverPage.getResult(),"Not Found");
    }
}
