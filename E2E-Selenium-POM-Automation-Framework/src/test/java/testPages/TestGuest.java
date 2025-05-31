package testPages;

import org.testng.annotations.Test;
import pages.GuestPage;

public class TestGuest extends BaseTest{GuestPage geust;
@Test
    public void  clickregisterationform(){
     geust= new GuestPage(BaseTest.driver);
    geust.clickRegister();
   // Assert.assertEquals(geust.getTitle(),"nopCommerce demo store. Home page title");


}}
