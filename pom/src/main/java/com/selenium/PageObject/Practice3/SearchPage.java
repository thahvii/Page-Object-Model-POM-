package com.selenium.PageObject.Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    // page element
    private By txtFlyingFrom = By.xpath("//input[@id='autocomplete']");
    private By chooseFlyingForm = By.xpath("//strong[normalize-space()='Tansonnhat Intl']");
    private By txtToDestination = By.xpath("//input[@id='autocomplete2']");
    private By chooseToDestination = By.xpath("//strong[normalize-space()='Kuala Lumpur Intl']");
    private By btnSearch = By.xpath("//button[@id='flights-search']");

    public SearchPage(WebDriver myBrowser) {
        super(myBrowser);
    }

    // page actions
    public BookingPage inputInfor() throws InterruptedException {
        myBrowser.findElement(txtFlyingFrom).sendKeys("ho chi");
        Thread.sleep(500);
        myBrowser.findElement(chooseFlyingForm).click();
        myBrowser.findElement(txtToDestination).sendKeys("kuala");
        Thread.sleep(500);
        myBrowser.findElement(chooseToDestination).click();
        myBrowser.findElement(btnSearch).click();
        Thread.sleep(2000);

        return new BookingPage(myBrowser);
    }


}
