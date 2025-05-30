package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import pages.GuestPage;

public class BaseTest {
    WebDriver driver;
   // @BeforeSuite
    @BeforeSuite
        public void setup() throws InterruptedException {
         driver=new EdgeDriver();
       // BasePage e=new BasePage(driver);
        Thread.sleep(3000);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

   /* @AfterSuite
    public void closure(){
        driver.quit();
    }*/

}
