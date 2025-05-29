package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends BasePage{
    WebDriver driver;
    RegisterationPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    @FindBy(id = "gender-male")
    private WebElement genderMale;
    @FindBy(id = "gender-female")
    private WebElement genderFemale;
    @FindBy(id = "FirstName")
    private WebElement firstName ;
    @FindBy(id = "LastName")
    private WebElement lastName ;
    @FindBy(id = "Password")
    private WebElement password ;
    @FindBy(id = "ConfirmPassword")
    private WebElement confirmPassword ;
    @FindBy(id = "Email")
    private WebElement email ;
    @FindBy(id = "register-button")
    private WebElement registerButton ;

    public void setGender (char gend ) {
        if(gend=='f'|gend=='F'){
            this.genderMale.click();
        }else if(gend=='m'|gend=='M'){
            this.genderFemale.click();

        }


    }

    public void setFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
       this.lastName.sendKeys(lastName);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword.sendKeys(confirmPassword);
    }
public Registerresult clickRegister(){
        registerButton.click();
        return new Registerresult(driver);
}
   }
