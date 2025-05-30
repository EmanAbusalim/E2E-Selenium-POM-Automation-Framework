package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pages.GuestPage;

public class BaseTest {
    //the webdriver should be static bto be passed to every object from the pase test or its subclasses
    //otherwise you will hav e a nullPointerException
    static WebDriver driver;
   // @BeforeSuite
    @BeforeSuite
        public void setup() throws InterruptedException {

ChromeOptions options=new ChromeOptions();
options.addArguments("--incognito");
driver=new ChromeDriver(options);
       // BasePage e=new BasePage(driver);
        Thread.sleep(3000);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //return new GuestPage(driver);
    }
    @AfterSuite
    public void closure(){
        driver.quit();
    }

}
