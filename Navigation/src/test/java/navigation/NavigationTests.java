package navigation;

import base.BaseTest;
import org.testng.annotations.Test;


public class NavigationTests extends BaseTest {

    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickExample1();
        getNavigation().goBack();
        getNavigation().goForward();
        getNavigation().refreshPage();
        getNavigation().navigateUrl("https://www.instagram.com/mundo.code/");
    }
}
