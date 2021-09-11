package com.selenium.PageObject.Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver myBrowser;

    // page element
    private By btnLogin = By.xpath("//a[@class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect']");
    private By gotIt = By.cssSelector("#cookie_stop");

    public BasePage(WebDriver myBrowser) {
        this.myBrowser = myBrowser;
    }

    public void gotIt() throws InterruptedException {
        myBrowser.findElement(gotIt).click();
        Thread.sleep(2000);
    }

    public LoginPage click() throws InterruptedException {
        myBrowser.findElement(btnLogin).click();
        Thread.sleep(1000);
        return new LoginPage(myBrowser);
    }

}
