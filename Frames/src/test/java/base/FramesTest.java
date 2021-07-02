package base;

import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

public class FramesTest extends BaseTest{

    @Test
    public void iFrameTest(){
        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditor();
        String text1 = "Hello ";
        String text2 = "World";
        wysiwygEditorPage.clearFrame();
        wysiwygEditorPage.setText(text1 + text2);
        wysiwygEditorPage.clickButtonIncreaseIndent();
    }
}
