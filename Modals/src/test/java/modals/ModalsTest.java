package modals;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ModalsTest extends BaseTest {


    @Test
    public void modalsTest(){
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.modalsClickRight();
        contextMenuPage.acceptModals();
    }
}
