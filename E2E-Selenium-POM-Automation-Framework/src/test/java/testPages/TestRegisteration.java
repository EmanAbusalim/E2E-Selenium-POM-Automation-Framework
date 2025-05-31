package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GuestPage;
import pages.RegisterationPage;

public class TestRegisteration extends BaseTest{
    @Test
    public void Register(){

        RegisterationPage register=new RegisterationPage(driver);
        GuestPage g= new GuestPage(driver);
        Assert.assertTrue(register.getRegisterMessage().contains("Your"));
        g.clickRegister();
        register.setGender('m');
        register.setFirstName("eman");
        register.setLastName("Abusalim");
        register.setEmail("EmaN@gmail.com");
        register.setPassword("asdfqwerW52");
        register.setConfirmPassword("asdfqwerW52");
        register.clickRegister();
    }


}
