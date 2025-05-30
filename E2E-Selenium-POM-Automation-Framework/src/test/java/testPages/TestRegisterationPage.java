package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterationPage;

public class TestRegisterationPage extends BaseTest{
    @Test
    public void Register(){
        RegisterationPage register=new RegisterationPage(driver);

        register.setGender('m');
        register.setFirstName("eman");
        register.setLastName("Abusalim");
        register.setEmail("EmaN@gmail.com");
        register.setPassword("asdfqwerW52");
        register.setConfirmPassword("asdfqwerW52");
        register.clickRegister();
        Assert.assertTrue(register.getRegisterMessage().contains("Your"));
    }


}
