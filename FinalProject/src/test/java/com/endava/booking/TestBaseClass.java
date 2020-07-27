package com.endava.booking;
import com.endava.booking.dataGeneration.DataGeneration;
import com.endava.booking.manager.DriverManager;
import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class TestBaseClass {

    protected WebDriver driver; //promenimo u protekted da bi naslednice mogleda koriste
    protected Faker faker = new Faker();
    protected DataGeneration dataGeneration = new DataGeneration();

    //sve prebacimo u novu klasu da se kod ne ponavlja
    @BeforeEach
    public void setUpDriver(){

        //WebDriverManager.chromedriver().setup();
        driver = DriverManager.getWebDriver();//obrisemo Webdriver jer ne definisemo dva puta

    }

    @AfterEach
    public void tearDownDriver() throws Exception {
        Thread.sleep(2000);//da bi videli sta se desilo
        //takeSnapShot(driver,"C://users/Slavica.Sulica/Documents/ss.jpeg" );
        driver.quit();
    }

    public void takeSnapShot(WebDriver webdriver,String   fileWithPath) throws Exception{

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile=new File(fileWithPath);

        FileUtils.copyFile(SrcFile, DestFile);
    }
}
