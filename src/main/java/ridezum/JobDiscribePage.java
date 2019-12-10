package ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class JobDiscribePage extends BasePage {
    public JobDiscribePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private List<WebElement> ApplyForThisJobButton;

    public JobDiscribePage clickApplyForThisJobButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ApplyForThisJobButton.get(0)));
        ApplyForThisJobButton.get(0).click();
        return new JobDiscribePage(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> JobApplyFields;

    public void FullNameField(String fullName) {
        wait.until(ExpectedConditions.elementToBeClickable(JobApplyFields.get(1)));
        JobApplyFields.get(1).sendKeys(fullName);
    }

    public void EmailField(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(JobApplyFields.get(2)));
        JobApplyFields.get(2).sendKeys(email);
    }

    public void PhoneField(String phone) {
        wait.until(ExpectedConditions.elementToBeClickable(JobApplyFields.get(3)));
        JobApplyFields.get(3).sendKeys(phone);
    }

    public void CurrentCompanyField(String currentCompany) {
        wait.until(ExpectedConditions.elementToBeClickable(JobApplyFields.get(4)));
        JobApplyFields.get(4).sendKeys(currentCompany);
    }

    public void LinkedinField(String linkedin) {
        wait.until(ExpectedConditions.elementToBeClickable(JobApplyFields.get(5)));
        JobApplyFields.get(5).sendKeys(linkedin);
    }

    public void PortfolioField(String portfolio) {
        wait.until(ExpectedConditions.elementToBeClickable(JobApplyFields.get(6)));
        JobApplyFields.get(6).sendKeys(portfolio);
    }

    @FindBy(css = "[name = comments]")
    private WebElement AdditionalInformation;
    public void additionalInformationField(String additionalInformation) {
        wait.until(ExpectedConditions.elementToBeClickable(AdditionalInformation));
        AdditionalInformation.sendKeys(additionalInformation);
    }


    @FindBy(css = "select")
    private List <WebElement> SelectDropDownButtons;

    public void selectGenderField() {
        wait.until(ExpectedConditions.elementToBeClickable(SelectDropDownButtons.get(0)));
        Select select = new Select(SelectDropDownButtons.get(0));
        select.selectByIndex(1);
    }

    public void selectRaceField() {
        wait.until(ExpectedConditions.elementToBeClickable(SelectDropDownButtons.get(1)));
        Select select1 = new Select(SelectDropDownButtons.get(1));
        select1.selectByIndex(2);
    }

    public void selectVeteranStatus() {
        wait.until(ExpectedConditions.elementToBeClickable(SelectDropDownButtons.get(2)));
        Select select2 = new Select(SelectDropDownButtons.get(2));
        select2.selectByIndex(1);
    }

    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private WebElement SubmitAplicationButton;

    public JobDiscribePage clickSubmitAplicationButton() {
        wait.until(ExpectedConditions.elementToBeClickable(SubmitAplicationButton));
        SubmitAplicationButton.click();
        return new JobDiscribePage(driver);
    }

    @FindBy(css = ".error-message")
    private List<WebElement> ErrorFields;

    public String errorResumeField() {
        wait.until(ExpectedConditions.elementToBeClickable(ErrorFields.get(0)));
        return ErrorFields.get(0).getText();
    }


}
