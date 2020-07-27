package com.endava.booking;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CatalogTest extends TestBaseClass{

    @Test
    public void shouldOpenCatalog(){

        HomePage homePage = new HomePage(driver);
        homePage.load();

        CatalogPage catalogPage = homePage.goToCatalog();

        assertThat(catalogPage.getHeaderContent()).isEqualTo("Collection:\n" + "Products");
    }
}
