package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GuestPage;
import pages.RegisterationPage;

public class TestGuestPage extends BaseTest{
    GuestPage geust;

@Test
    public void  checkTitle(){
     geust= new GuestPage(driver);
    RegisterationPage reg=geust.clickRegister();
   // Assert.assertEquals(geust.getTitle(),"nopCommerce demo store. Home page title");


}}
