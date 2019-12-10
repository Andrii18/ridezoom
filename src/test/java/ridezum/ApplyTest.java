package ridezum;

import org.junit.Test;
import org.openqa.selenium.By;


public class ApplyTest extends BaseTest {

    @Test
    public void testApplyToDrive() {

        HomePage homePage = new HomePage(driver);

        ApplyDrivePage applyDrivePage = homePage.clickApplyToDriveButton();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyDrivePage.firstName(clientApply.getFirstName());

        applyDrivePage.lastName(clientApply.getLastName());

//        String email = EmailGenerator.generator;

//        applyDrivePage.email(clientApply.getEmail());

        applyDrivePage.email(emailGenerator.generator());

        applyDrivePage.phone(clientApply.getPhone());

        applyDrivePage.zipCode(clientApply.getZipCode());

//        applyDrivePage.selectState(3);

        applyDrivePage.selectStateByName("California");

        driver.switchTo().defaultContent();

//        applyDrivePage.clickSchoolsButton();



    }
}
