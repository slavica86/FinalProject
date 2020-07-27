package com.endava.booking;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookingTest extends TestBaseClass{
    @Test
    public void shouldSelectRandomProduct(){
        HomePage homePage = new HomePage(driver);
        homePage.load();

        BookingProductsPage bookingProductsPage = homePage.goToBooking();
        ProductPage productPage = bookingProductsPage.selectAnyProduct();
        assertThat(productPage.priceOfProduct()).isGreaterThan("0");//.isBetween("0.00","200.00");
    }
}
