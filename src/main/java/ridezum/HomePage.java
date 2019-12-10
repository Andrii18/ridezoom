package ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".m-btn.front-banner__btn")
    private List<WebElement> homePageButtons;

    public ApplyDrivePage clickApplyToDriveButton() {
        wait.until(ExpectedConditions.elementToBeClickable(homePageButtons.get(1)));
        homePageButtons.get(1).click();
        return new ApplyDrivePage(driver);
    }

    public SeeSolutionsPage clickSeeSolutionsButton() {
        wait.until(ExpectedConditions.elementToBeClickable(homePageButtons.get(2)));
        homePageButtons.get(2).click();
        return new SeeSolutionsPage(driver);
    }

}
