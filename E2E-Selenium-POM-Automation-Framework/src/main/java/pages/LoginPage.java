package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "Email")
    private WebElement email;
    @FindBy(id = "Password")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit' and text()='Log in']")
    private WebElement loginButton;

    public void setEmail(String email){
       this.email.sendKeys(email);
    }
    public void setPassword(String password){
        this.password.sendKeys(password);
    }

    public HomePage clickLogin(){
        loginButton.click();
        return new HomePage(driver);
    }








}
