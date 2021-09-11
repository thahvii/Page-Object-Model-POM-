package com.selenium.PageObject.Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FightsBookingPage extends BasePage {

    // page elements
    private By ckbPayment = By.xpath("//input[@id='gateway_bank-transfer']");
    private By btnConfirm = By.xpath("//button[@id='booking']");

    public FightsBookingPage(WebDriver myBrowser) {
        super(myBrowser);
    }

    // page actions
    public void submit() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) myBrowser;
        js.executeScript("arguments[0].scrollIntoView();", myBrowser.findElement(ckbPayment));
        Thread.sleep(1000);
        myBrowser.findElement(ckbPayment).click();
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView();", myBrowser.findElement(btnConfirm));
        Thread.sleep(1000);
        myBrowser.findElement(btnConfirm).click();
        Thread.sleep(2000);

    }

}
