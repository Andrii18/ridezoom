package ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SeeSolutionsPage extends BasePage {

    public SeeSolutionsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = ".m-btn.scroll-to-btn")
    private List <WebElement> pageButtons;



    public ApplyContactPage clickContactSalesButton() {
        wait.until(ExpectedConditions.elementToBeClickable(pageButtons.get(1)));
        pageButtons.get(1).click();
        return new ApplyContactPage(driver);

    }
}
