package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertTests extends BaseTest {

    @Test
    public void alertTests(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.acceptJsAlert();
        Assert.assertEquals(alertsPage.textJsAlert(),"You successfully clicked an alert");
        alertsPage.acceptJsConfirm();
        Assert.assertEquals(alertsPage.textJsAlert(),"You clicked: Ok");
        alertsPage.cancelJsConfirm();
        Assert.assertEquals(alertsPage.textJsAlert(),"You clicked: Cancel");
        alertsPage.acceptJsPrompt();
        Assert.assertEquals(alertsPage.textJsAlert(),"You entered: Ivan");
        alertsPage.cancelJsPrompt();
        Assert.assertEquals(alertsPage.textJsAlert(),"You entered: null");
    }
}