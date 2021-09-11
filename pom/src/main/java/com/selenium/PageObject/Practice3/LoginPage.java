package com.selenium.PageObject.Practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    // page elements

    private By txtEmail = By.xpath("//input[@name='email']");
    private By txtPassword = By.xpath("//input[@name='password']");
    private By btnLogin = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver myBrowser) {
        super(myBrowser);
    }

    // page actions

    public HomePage actionLogin() throws InterruptedException {
        Thread.sleep(3000);
        myBrowser.findElement(txtEmail).sendKeys("user@phptravels.com");
        myBrowser.findElement(txtPassword).sendKeys("demouser");
        myBrowser.findElement(btnLogin).click();
        Thread.sleep(2000);
        return new HomePage(myBrowser);
    }
}
