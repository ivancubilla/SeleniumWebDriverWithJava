package frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

public class FramesTest extends BaseTest {

    String text1 = "Hello ";
    String text2 = "World";

    @Test
    public void iFrameTest(){
        WysiwygEditorPage wysiwygEditorPage = homePage.clickWysiwygEditor();
        wysiwygEditorPage.clearFrame();
        wysiwygEditorPage.setText(text1 + text2);
        wysiwygEditorPage.clickButtonIncreaseIndent();
        Assert.assertEquals(wysiwygEditorPage.textResult(),"Hello World");
    }
}
