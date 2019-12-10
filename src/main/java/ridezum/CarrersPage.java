package ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarrersPage extends BasePage {
    public CarrersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".m-btn.m-banner__btn")
    private WebElement viewJobButton;

    public ListOfPositionPage clickViewJobButton() {
        wait.until(ExpectedConditions.elementToBeClickable(viewJobButton));
        viewJobButton.click();
        return new ListOfPositionPage(driver);
    }
}
