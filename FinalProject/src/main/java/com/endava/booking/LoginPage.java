package com.endava.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    public By createAccountLink = By.id("customer_register_link");
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public CreateAccountPage goToCreateAccount(){
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(createAccountLink));
        button.click();
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //homePage.waitForLoggedInScreenToAppear();
        return createAccountPage;
    }
}
