package com.selenium.PageObject.Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateHotelPage extends LoginPage {
    // page elements
    private By txtHotelName = By.xpath("//input[@name='hotelname']");
    private By clickLocation = By.xpath("//span[@class='select2-chosen']");
    private By txtLocation = By.xpath("//input[@class='select2-input select2-focused']");
    private By chooseLocation = By.xpath("//*[@id='select2-drop']/ul/li[1]");
    private By iFrame = By.tagName("iframe");
    private By txtHotelDescription = By.xpath("//body//p//br");
    private By submit = By.id("add");

    public CreateHotelPage(WebDriver myBrowser) {
        super(myBrowser);
    }

    // page actions
    public void createHotel() throws InterruptedException {
        myBrowser.findElement(txtHotelName).sendKeys("Hotel Vi");
        Thread.sleep(2000);
        myBrowser.findElement(clickLocation).click();
        myBrowser.findElement(txtLocation).sendKeys("cali");
        Thread.sleep(2000);
        myBrowser.findElement(chooseLocation).findElement(chooseLocation).click();
        Thread.sleep(2000);
        myBrowser.switchTo().frame(myBrowser.findElement(iFrame));
        Thread.sleep(2000);
        myBrowser.findElement(txtHotelDescription)
                .sendKeys("The hotel is a modern and elegant 4-star hotel, overlooking the sea");
        myBrowser.switchTo().defaultContent();
        Thread.sleep(2000);
        myBrowser.findElement(submit).click();
        Thread.sleep(2000);
    }

    // page validation

}
