package com.selenium.PageObject.Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPage extends BasePage {

    // page element
    private By btnBook = By.xpath("(//button[@type='submit'])[1]");

    public BookingPage(WebDriver myBrowser) {
        super(myBrowser);

    }

    // page actions
    public FightsBookingPage clickBtnBook() throws InterruptedException {
        myBrowser.findElement(btnBook).click();
        Thread.sleep(2000);

        return new FightsBookingPage(myBrowser);
    }

}
