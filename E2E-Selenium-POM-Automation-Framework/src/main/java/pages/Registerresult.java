package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v135.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerresult extends BasePage{
    WebDriver driver;
    Registerresult(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='result']")
    private WebElement registerationMessage;
    @FindBy(linkText="Continue")
        private WebElement continueButton;

    public HomePage clickContinue(){
        continueButton.click();
        return new HomePage(driver);
    }







}
