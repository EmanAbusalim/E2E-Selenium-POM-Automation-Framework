package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GuestPage extends BasePage{

  public GuestPage(WebDriver driver){
       super(driver);
       // this.driver=driver;
    }
/*@FindBy(tagName = "title")
    private WebElement title;*/
  @FindBy(linkText = "Register")
  private WebElement registerButton;

    public String getTitle() {

        return driver.getTitle();
    }
    public void clickRegister(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(registerButton)).click();

        //registerButton.click();
        //return new RegisterationPage(driver);
    }



}
