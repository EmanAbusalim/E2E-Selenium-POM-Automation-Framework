package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.GuestPage;

public class BaseTest {
    WebDriver driver;
   // @BeforeSuite
    @BeforeClass
        public GuestPage setup() throws InterruptedException {
         driver=new ChromeDriver();
       // BasePage e=new BasePage(driver);
        Thread.sleep(3000);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        return new GuestPage(driver);
    }

    @AfterSuite
    public void closure(){
        driver.quit();
    }

}
