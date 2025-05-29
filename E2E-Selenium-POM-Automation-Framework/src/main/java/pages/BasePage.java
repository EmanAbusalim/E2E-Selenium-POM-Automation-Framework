package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    // this class is for having the driver to pass it to the framework pages
//https://demo.nopcommerce.com
    WebDriver driver;
    BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this );
    }
}
