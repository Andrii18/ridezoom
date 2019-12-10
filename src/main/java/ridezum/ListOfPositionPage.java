package ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ListOfPositionPage extends BasePage {
    public ListOfPositionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".posting-btn-submit.template-btn-submit.hex-color")
    private List<WebElement> ApplyButtons;

//    @FindBy(css = "a.posting-btn-submit.template-btn-submit.hex-color")
//    private List<WebElement>ApplyButton;

    public ListOfPositionPage clickApplyButton1() {
        wait.until(ExpectedConditions.elementToBeClickable(ApplyButtons.get(0)));
        ApplyButtons.get(0).click();
        return new ListOfPositionPage(driver);
    }

}
