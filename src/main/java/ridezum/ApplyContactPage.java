package ridezum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.util.List;

public class ApplyContactPage extends BasePage {

    public ApplyContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> applyFields;

    @FindBy(css = ".m-dropdown__item")
    private List <WebElement> titleField;

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

    public void email(String email) {
        applyFields.get(4).sendKeys(email);
    }

    public void phoneNumber(String phoneNumber) {
        applyFields.get(5).sendKeys(phoneNumber);
    }

    public void zipCode(String zipCode) {
        applyFields.get(6).sendKeys(zipCode);
    }

    public void titleClickField () {
        wait.until(ExpectedConditions.elementToBeClickable(titleField.get(3)));
        titleField.get(3).click();
    }

    Actions actions = new Actions(driver);
    WebElement target = driver.findElement(By.cssSelector("input[name=\"title\"]"));

    Actions mouseClick = new Actions(driver);

    public void mouseMove() {
        wait.until(ExpectedConditions.visibilityOfAllElements(target));
        actions.moveToElement(target).perform();
        mouseClick.click().perform();
    }

}
