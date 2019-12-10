package ridezum;

//import com.sun.security.ntlm.Client;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class BaseTest {

    protected static WebDriver driver;

//    public static Logger log = Logger.getLogger(BaseTest.class.getName());

    protected static Client clientApply;

    protected HomePage homepage;

    protected static EmailGenerator emailGenerator;



    @BeforeClass
    public static void testBase() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\andri\\Desktop\\chromedriver.exe");

       driver = new ChromeDriver();

        driver.get("https://ridezum.com/");

        String  actualTitle = driver.getTitle();

//        System.out.println(actualTitle);

        String expectTitle = "Zūm";

        Assert.assertEquals(expectTitle, actualTitle);

        clientApply = new Client("Ivan", "Ivanov", "ivan@gmail.com", "12345678910", "WA", "10000");

        emailGenerator = new EmailGenerator();
    }

//    @AfterClass
//    public static void teerDown() {
//        driver.quit();
//    }
}
