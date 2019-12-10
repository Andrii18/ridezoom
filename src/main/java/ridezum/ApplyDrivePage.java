package ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyDrivePage extends BasePage {

    public ApplyDrivePage(WebDriver driver) {
        super(driver);}

    @FindBy(css = "#application_form_first_name")
    private WebElement inputFirstNameField;

    public void firstName(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(inputFirstNameField));
        inputFirstNameField.sendKeys(firstName);
    }

    @FindBy(css = "#application_form_last_name")
    private WebElement inputLastNameField;

    public void lastName(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(inputLastNameField));
        inputLastNameField.sendKeys(lastName);
    }

    @FindBy(css = "#application_form_email")
    private WebElement inputEmailField;

    public void email(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(inputEmailField));
        inputEmailField.sendKeys(email);
    }

    @FindBy(css = "#application_form_phone_number")
    private WebElement inputPhoneNumberField;

    public void phone(String phone) {
        wait.until(ExpectedConditions.elementToBeClickable(inputPhoneNumberField));
        inputPhoneNumberField.sendKeys(phone);
    }

    @FindBy(css = "#application_form_zipcode")
    private WebElement inputZipCodeField;

    public void zipCode(String zipCode) {
        wait.until(ExpectedConditions.elementToBeClickable(inputZipCodeField));
        inputZipCodeField.sendKeys(zipCode);
    }
    @FindBy(css = "#application_form_applicant_state")
    private WebElement stateSelectButton;

    public void selectState(int index) {
        wait.until(ExpectedConditions.elementToBeClickable(stateSelectButton));
        Select select = new Select(stateSelectButton);
        select.selectByIndex(index);
    }

    @FindBy(css = "#application_form_applicant_state")
    private WebElement stateSelectButtonName;

    public void selectStateByName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(stateSelectButton));
        Select select = new Select(stateSelectButton);
        select.selectByValue(name);
    }

    @FindBy(css = ".main-menu__link")
    private List<WebElement> homePageButtons1;

    public void clickSchoolsButton() {
        wait.until(ExpectedConditions.elementToBeClickable(homePageButtons1.get(0)));
        homePageButtons1.get(0).click();
    }

    @FindBy(css = ".btn-apply.js-submit.app-apply-button.application-form__submit-button")
    private WebElement submitButton;

    public void clickSubmitButton() {
        submitButton.click();
    }

    @FindBy(css = ".help-block")
    private List <WebElement> errorMessageField;

    public String errorFirstNameField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorMessageField.get(0)));
        return errorMessageField.get(0).getText();
    }
    public String errorLastNameField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorMessageField.get(2)));
        return errorMessageField.get(2).getText();
    }
    public String errorEmailField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorMessageField.get(5)));
        return errorMessageField.get(5).getText();
    }
    public String errorPhoneNumberField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorMessageField.get(7)));
        return errorMessageField.get(7).getText();
    }
    public String errorHomeStateField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorMessageField.get(9)));
        return errorMessageField.get(9).getText();
    }
    public String errorHomeZipCodeField() {
        wait.until(ExpectedConditions.visibilityOfAllElements(errorMessageField.get(10)));
        return errorMessageField.get(10).getText();
    }













}
