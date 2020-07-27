package com.endava.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private static final String baseUrl = "https://webkul-booking-app-demo-2.myshopify.com/";

    private WebDriver webDriver;

    public By registerButton = By.cssSelector("a.site-header__icon.site-header__account");
    //a[@class = 'site-header__icon site-header__account']/span[contains(text(), "Account")] xpath
    public By loggedInUserLink = By.cssSelector("a[href^='/account']");

    public By catalogButton = By.cssSelector("#SiteNav > li:nth-child(2) > a > span");

    public By bookingButton = By.cssSelector("#SiteNav > li:nth-child(5) > a > span");
            //("a.site-nav__link site-nav__link--main site-nav__link--active");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void load(){
        webDriver.get(baseUrl);
    }

    public LoginPage goToRegisterUser(){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        button.click();

        return new LoginPage(webDriver);
    }

    public void waitForLoggedInScreenToAppear(){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(loggedInUserLink));//.+ menja sve sledece karaktere u stringu
    }

    public CatalogPage goToCatalog(){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(catalogButton));
        button.click();

        return new CatalogPage(webDriver);
    }


    public BookingProductsPage goToBooking(){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(bookingButton));
        button.click();

        return new BookingProductsPage(webDriver);
    }
//    public boolean isDisplayedLink () {
//        return ExpectedConditions.visibilityOf(loggedInUserLink);
//    }
}
