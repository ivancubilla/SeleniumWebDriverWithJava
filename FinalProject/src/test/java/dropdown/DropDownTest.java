package dropdown;

import org.testng.annotations.Test;
import pages.DropdownListPage;
import base.test.BaseTest;

public class DropDownTest extends BaseTest {

    @Test
    public void testDropDown(){
        DropdownListPage dropdownListPage = homePage.clickDropdown();
        dropdownListPage.dropdownByIndex(1);
        dropdownListPage.dropdownByName("Option 2");
        dropdownListPage.dropdownByValue(2);
    }
}
