package pages;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    WebDriver driver;
    HomePage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
}
