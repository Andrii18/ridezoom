package ridezum;

import org.junit.Test;
import org.openqa.selenium.By;

public class  ApplyContactTest extends BaseTest {

    @Test
    public void testApplyContact() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        seeSolutionsPage = homePage.clickSeeSolutionsButton();

        applyContactPage = seeSolutionsPage.clickContactSalesButton();

        applyContactPage.firstName("Ivan");

        applyContactPage.lastName("Ivanov");

        applyContactPage.schoolName("Green");

        String email = emailGenerator.generator();

        applyContactPage.email(email);

        applyContactPage.phoneNumber("12233490900");

        applyContactPage.zipCode("50000");

        applyContactPage.mouseMove();

        applyContactPage.titleClickField();
    }
}
