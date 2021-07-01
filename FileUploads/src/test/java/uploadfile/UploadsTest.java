package uploadfile;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FileUploaderPage;

public class UploadsTest extends BaseTest {

    @Test
    public void uploadsTest(){
        FileUploaderPage fileUploaderPage = homePage.clickFileUploads();
        fileUploaderPage.uploadFile("C:\\Users\\ivanc\\Desktop\\SeleniumWebDriver With Java\\FileUploads\\resources\\chromedriver.exe");
        fileUploaderPage.successfullUpload();
    }
}
