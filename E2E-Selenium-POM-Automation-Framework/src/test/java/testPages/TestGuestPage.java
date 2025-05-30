package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GuestPage;
import pages.RegisterationPage;

public class TestGuestPage extends BaseTest{

@Test
    public void  checkTitle(){
    GuestPage geust= new GuestPage(driver);
    geust.clickRegister();
   // Assert.assertEquals(geust.getTitle(),"nopCommerce demo store. Home page title");


}}
