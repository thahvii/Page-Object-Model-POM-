package com.selenium.PageObject.Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

    private By logo = By.xpath("//i[@class='la la-check icon-element flex-shrink-0 mr-3 ml-0']");

    public CheckoutPage(WebDriver myBrowser) {
        super(myBrowser);
    }

    public boolean check() throws InterruptedException {
        Thread.sleep(3000);
        if (myBrowser.findElement(logo).isDisplayed()) {
            return true;
        }
        return false;
    }
}
