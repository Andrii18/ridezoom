package ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class EmptyFieldVerificationsTest extends BaseTest {

    @Test
    public void testEmptyFieldVerifications() {

        HomePage homePage = new HomePage(driver);

        ApplyDrivePage applyDrivePage = homePage.clickApplyToDriveButton();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyDrivePage.clickSubmitButton();

        String error1 = applyDrivePage.errorFirstNameField();
        Assert.assertEquals("Please enter a value", error1);

        String error2 = applyDrivePage.errorLastNameField();
        Assert.assertEquals("Please enter a value", error2);

        String error3 = applyDrivePage.errorEmailField();
        Assert.assertEquals("Please enter a value", error3);

        String error4 = applyDrivePage.errorPhoneNumberField();
        Assert.assertEquals("Please enter a value", error4);

        String error5 = applyDrivePage.errorHomeStateField();
        Assert.assertEquals("Please enter a value", error5);

        String error6 = applyDrivePage.errorHomeZipCodeField();
        Assert.assertEquals("Please enter a value", error6);

        String error7 = applyDrivePage.errorHomeZipCodeField();
        Assert.assertEquals("Please enter a value", error7);









    }
}
