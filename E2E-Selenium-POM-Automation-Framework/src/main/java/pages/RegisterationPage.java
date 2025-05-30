package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends BasePage {
    WebDriver driver;

    public RegisterationPage(WebDriver driver) {
        super(driver);
        // this.driver=driver;
    }

    @FindBy(xpath = "//strong[text()='Your Personal Details']")
    private WebElement registerMessage;
    @FindBy(xpath = "//label[@for='gender-female']")
    private WebElement genderMale;
    @FindBy(xpath = "//label[@for='gender-female']")
    private WebElement genderFemale;
    @FindBy(id = "FirstName")
    private WebElement firstName;
    @FindBy(id = "LastName")
    private WebElement lastName;
    @FindBy(id = "Password")
    private WebElement password;
    @FindBy(id = "ConfirmPassword")
    private WebElement confirmPassword;
    @FindBy(id = "Email")
    private WebElement email;
    @FindBy(id = "register-button")
    private WebElement registerButton;

    public String getRegisterMessage() {
        return registerMessage.getText();
    }

    public void setGender(char gend) {
        if (gend == 'm' || gend == 'M') {
            genderMale.click();
        } else if (gend == 'f' || gend == 'F') {
            genderFemale.click();

        }


    }

    public void setFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword.sendKeys(confirmPassword);
    }

    public RegisterationResult clickRegister() {
        registerButton.click();
        return new RegisterationResult(driver);
    }

}