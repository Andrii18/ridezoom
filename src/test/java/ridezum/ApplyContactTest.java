package ridezum;

import org.junit.Test;

public class ApplyContactTest extends BaseTest {

    @Test
    public void testApplyContact() {

        HomePage homePage = new HomePage(driver);

        SeeSolutionsPage seeSolutionsPage = homePage.clickSeeSolutionsButton();

        ApplyContactPage applyContactPage = seeSolutionsPage.clickContactSalesButton();

        applyContactPage.firstName("Ivan");

        applyContactPage.lastName("Ivanov");

        applyContactPage.schoolName("Green");

        applyContactPage.title("");

        String email = emailGenerator.generator();

        applyContactPage.email(email);

        applyContactPage.phoneNumber("12233490900");

        applyContactPage.zipCode("50000");





    }


}
