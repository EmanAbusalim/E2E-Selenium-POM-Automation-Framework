package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationResult extends BasePage{
    RegisterationResult(WebDriver driver){
        super(driver);
       // this.driver=driver;
       // PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='result']")
    private WebElement registerationMessage;
    @FindBy(linkText="Continue")
        private WebElement continueButton;
    public String getMessage(){
        return registerationMessage.getText();
    }

    public LoginPage clickContinue(){
        continueButton.click();
        return new LoginPage(driver);
    }







}
