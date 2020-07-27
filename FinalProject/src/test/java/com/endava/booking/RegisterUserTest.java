package com.endava.booking;

import com.endava.booking.models.User;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RegisterUserTest extends  TestBaseClass{
    @Test
    public void shouldRegisterUser(){
        //Given
        HomePage homePage = new HomePage(driver);
        homePage.load();
        User user = dataGeneration.generateRandomUser();

        //When
        //homePage.goToRegisterUser().goToCreateAccount();

        LoginPage loginPage = homePage.goToRegisterUser();
        CreateAccountPage createAccountPage = loginPage.goToCreateAccount();
        HomePage loggedInUserHomePage = createAccountPage.registerUser(user);

        //Then
        assertThat(loggedInUserHomePage.loggedInUserLink);
    }
}
