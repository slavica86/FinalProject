package com.endava.booking.dataGeneration;

import com.endava.booking.models.User;
import com.github.javafaker.Faker;

public class DataGeneration {

    private Faker faker = new Faker();
    public User generateRandomUser() {

        User user = new User();

        user.setFirstName(faker.name().firstName());
        user.setLastName(faker.name().lastName());
        user.setEmail(faker.internet().emailAddress());
        user.setPassword(faker.internet().password());

        return user;
    }

}
