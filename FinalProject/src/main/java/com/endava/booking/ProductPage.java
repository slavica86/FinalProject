package com.endava.booking;

import com.sun.jdi.ByteValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
   private WebDriver driver;

    public By dataRangeInput = By.xpath("//*[@id=\"booking-form-id\"]/div/div/div[2]/div/div[2]/input");
    public By startDataAvailable = By.cssSelector("td.today.active.start-date.available");
    public By calendarPopup = By.cssSelector(".dp-days");
    public By price = By.cssSelector("");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String priceOfProduct() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement amount =wait.until(ExpectedConditions.visibilityOfElementLocated(price));

        return amount.getText();
    }


}
