package com.endava.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage {

    private WebDriver driver;

    public By productHeader = By.cssSelector("#shopify-section-collection-template > div > header > div.page-width > div > h1 > span");

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderContent() {
        return driver.findElement(productHeader).getText();
    }

}
