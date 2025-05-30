package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    // this class is for having the drive from the pages to apply init element and the shared methods between pages
//https://demo.nopcommerce.com
    WebDriver driver;
    public  BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this );
    }

}
