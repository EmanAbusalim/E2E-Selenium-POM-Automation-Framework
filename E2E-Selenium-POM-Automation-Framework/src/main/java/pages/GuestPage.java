package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuestPage extends BasePage{
    WebDriver driver;
  public GuestPage(WebDriver driver){
       super(driver);
       // this.driver=driver;
    }
@FindBy(tagName = "title")
    private WebElement title;
  @FindBy(xpath = "//a[text()='Register']")
  private WebElement registerButton;

    public String getTitle() {

        return title.getText();
    }
    public RegisterationPage clickRegister(){
       registerButton.click();
        return new RegisterationPage(driver);
    }



}
