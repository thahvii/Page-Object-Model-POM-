package com.selenium.PageObjectTest.Practice2;

import com.selenium.PageObject.Practice2.CreateHotelPage;
import com.selenium.PageObject.Practice2.DashboardPage;
import com.selenium.PageObject.Practice2.HotelPage;
import com.selenium.PageObject.Practice2.LoginPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateHotelPageTest extends LoginPageTest {
    @BeforeMethod
    public void setUp() {
        String driverPath = "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        this.myBrowser = new ChromeDriver();
        this.myBrowser.get("https://phptravels.net/api/admin");
        this.myBrowser.manage().window().maximize();
    }

    @Test
    public void testCreateHotelSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        LoginPage clickLogin = new LoginPage(this.myBrowser);
        clickLogin.login();
        DashboardPage dashboardPage = new DashboardPage(this.myBrowser);

        Thread.sleep(2000);
        dashboardPage.selectLnkHotel();
        Thread.sleep(2000);
        HotelPage hotelPage = new HotelPage(this.myBrowser);
        hotelPage.clickBtnAdd();
        Thread.sleep(2000);
        CreateHotelPage hotel = new CreateHotelPage(this.myBrowser);
        hotel.createHotel();
    }

    @AfterMethod
    public void tearDown() {
        this.myBrowser.quit();
    }
}
