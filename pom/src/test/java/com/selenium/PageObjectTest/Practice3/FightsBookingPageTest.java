package com.selenium.PageObjectTest.Practice3;

import com.selenium.PageObject.Practice3.BookingPage;
import com.selenium.PageObject.Practice3.CheckoutPage;
import com.selenium.PageObject.Practice3.FightsBookingPage;
import com.selenium.PageObject.Practice3.HomePage;
import com.selenium.PageObject.Practice3.LoginPage;
import com.selenium.PageObject.Practice3.SearchPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FightsBookingPageTest extends BasePageTest {
    @BeforeMethod
    public void setUp() {
        String driverPath = "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        this.myBrowser = new ChromeDriver();
        this.myBrowser.get("https://phptravels.net/");
        this.myBrowser.manage().window().maximize();
    }

    @Test
    public void testFlightsBookingSuccessfully() throws InterruptedException {

        Thread.sleep(2000);
        LoginPage loginPage = new LoginPage(myBrowser);
        loginPage.gotIt();
        loginPage.click();
        loginPage.actionLogin();
        HomePage homePage = new HomePage(myBrowser);
        homePage.clickLnkFlight();
        Thread.sleep(2000);

        SearchPage searchPage = new SearchPage(myBrowser);
        searchPage.inputInfor();
        Thread.sleep(1000);
        BookingPage bookingPage = new BookingPage(myBrowser);
        bookingPage.clickBtnBook();
        FightsBookingPage fighsBookingPage = new FightsBookingPage(myBrowser);
        fighsBookingPage.submit();
        Thread.sleep(1000);
        CheckoutPage checkoutPage = new CheckoutPage(myBrowser);
        checkoutPage.check();
    }

    @AfterMethod
    public void tearDown() {
        this.myBrowser.quit();
    }
}
