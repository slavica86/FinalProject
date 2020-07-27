package com.endava.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class BookingProductsPage {
    private WebDriver driver;

    public By bookingProductsHeader = By.cssSelector("#bc-main-content-wrapper > div.wk-booking-product-top > div.wk-booking-product-header");

    public By bookNowButton = By.xpath("//*[contains(text(), 'Book Now')]");


    public BookingProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage selectAnyProduct() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(bookingProductsHeader));

        // get all links by xpath
        List<WebElement> list = driver.findElements(bookNowButton);

        // select a random one
        Random gen = new Random();
        WebElement link = list.get(gen.nextInt(list.size()));

        link.click();
        //driver.findElement(bookNowButton).click();

        return new ProductPage(driver);
    }


//    public String getHeaderContent() {
//        return driver.findElement(bookingProductsHeader).getText();
//    }
}
