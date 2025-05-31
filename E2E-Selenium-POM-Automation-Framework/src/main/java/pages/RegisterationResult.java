package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationResult extends BasePage{
   public  RegisterationResult(WebDriver driver){
        super(driver);
       // this.driver=driver;
       // PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='result']")
    private WebElement registerationMessage;
    @FindBy(linkText="Continue")
        private WebElement continueButton;

    //actions
    public String getMessage(){
        return registerationMessage.getText();
    }

    public void clickContinue(){
        continueButton.click();
       // return new HomePage(driver);this line canceled according to the structure of pom i use
    }







}
