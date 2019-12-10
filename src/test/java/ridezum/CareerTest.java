package ridezum;

import org.junit.Assert;
import org.junit.Test;

public class CareerTest extends BaseTest {

    @Test
    public void testCarrer() throws InterruptedException {

        HomePage homepage = new HomePage(driver);

        driver.get("https://ridezum.com/careers.html");

        CarrersPage carrersPage = new CarrersPage(driver);

        ListOfPositionPage listOfPositionPage = carrersPage.clickViewJobButton();

        //remember the previous tab(window)
        String windowHandleBefore = driver.getWindowHandle();

        //Switch to new tab(window) that opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }


        ListOfPositionPage jobDiscribePage = listOfPositionPage.clickApplyButton1();

        JobDiscribePage jobDiscribePage1 = new JobDiscribePage(driver);

        jobDiscribePage1.clickApplyForThisJobButton();

        Thread.sleep(3000);

        jobDiscribePage1.FullNameField("Ivan Ivanov");

        jobDiscribePage1.EmailField("ivan@gmail.com");

        jobDiscribePage1.PhoneField("111 111 11 11");

        jobDiscribePage1.CurrentCompanyField("Microsoft");

        jobDiscribePage1.LinkedinField("Linkidin");

        jobDiscribePage1.PortfolioField("Portfolio");

        Thread.sleep(3000);

        jobDiscribePage1.additionalInformationField("Additional information");

        Thread.sleep(3000);

        jobDiscribePage1.selectGenderField();

        jobDiscribePage1.selectRaceField();

        jobDiscribePage1.selectVeteranStatus();

        jobDiscribePage1.clickSubmitAplicationButton();

        String error1 = jobDiscribePage1.errorResumeField();
        Assert.assertEquals("✱ Please attach a resume", error1);

    }
}
