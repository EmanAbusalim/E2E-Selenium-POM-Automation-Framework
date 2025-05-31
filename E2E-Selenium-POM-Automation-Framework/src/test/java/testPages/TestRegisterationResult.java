package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterationResult;

public class TestRegisterationResult extends BaseTest {
    RegisterationResult res;
    @Test
    public void testRegister(){
        res = new RegisterationResult(driver);
        String message=res.getMessage();

        Assert.assertTrue(message.contains("your registration"));
        res.clickContinue();
    }






}
