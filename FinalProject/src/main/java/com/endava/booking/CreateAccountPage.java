package com.endava.booking;

import com.endava.booking.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {

    public WebDriver driver;
    private By firstNameInput = By.id("RegisterForm-FirstName");
    private By lastNameInput = By.id("RegisterForm-LastName");
    private By emailInput = By.id("RegisterForm-email");
    private By passwordInput = By.id("RegisterForm-password");
    private By createButton = By.cssSelector("#RegisterForm > p > input");

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage registerUser (User user){

        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput));//na ostale ne cekmao jer su se pojavili cim se pojavio prvi
        input.sendKeys(user.getFirstName());

        driver.findElement(lastNameInput).sendKeys(user.getLastName());
        driver.findElement(emailInput).sendKeys(user.getEmail());
        driver.findElement(passwordInput).sendKeys(user.getPassword());

        driver.findElement(createButton).click();

        HomePage homePage = new HomePage(driver);
        homePage.waitForLoggedInScreenToAppear();
        return homePage;
    }
}
