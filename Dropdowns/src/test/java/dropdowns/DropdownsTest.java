package dropdowns;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropdownList;

public class DropdownsTest extends BaseTest {

    @Test
    public void selectDropdowns(){
        DropdownList dropdownList = homePage.clickDropdown();
        dropdownList.selectIndex(1);
        dropdownList.selectValue(1);
        dropdownList.selectName("Option 2");
        dropdownList.assertTitle();

    }
}