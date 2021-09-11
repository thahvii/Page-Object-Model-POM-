package com.selenium.PageObject.Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    // page element
    private By lnkFlights = By.xpath("//a[contains(text(),'flights')]");

    public HomePage(WebDriver myBrowser) {
        super(myBrowser);
    }

    // page actions
    public void clickLnkFlight() throws InterruptedException {
        myBrowser.findElement(lnkFlights).click();
        Thread.sleep(1000);
    }

}
