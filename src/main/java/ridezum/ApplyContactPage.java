package ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ApplyContactPage extends BasePage {

    public ApplyContactPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input")
    private List<WebElement> applyFields;

    public void firstName( String firstName) {
        wait.until(ExpectedConditions.visibilityOfAllElements(applyFields.get(0)));
        applyFields.get(0).sendKeys(firstName);
    }

    public void lastName (String lastName) {
        applyFields.get(1).sendKeys(lastName);
    }

    public void schoolName (String schoolName) {
        applyFields.get(2).sendKeys(schoolName);
    }

    public void title (String title) {
        applyFields.get(3).sendKeys(title);
    }

    public void email(String email) {
        applyFields.get(4).sendKeys(email);
    }

    public void phoneNumber(String phoneNumber) {
        applyFields.get(5).sendKeys(phoneNumber);
    }

    public void zipCode(String zipCode) {
        applyFields.get(6).sendKeys(zipCode);
    }






}
