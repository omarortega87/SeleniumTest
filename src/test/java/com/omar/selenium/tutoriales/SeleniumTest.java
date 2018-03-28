package com.omar.selenium.tutoriales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.nio.file.Path;

import static java.nio.file.FileSystems.getDefault;


public class SeleniumTest {

    @Test
    public void getTitleAutentiaTest() {


        //if you're going to use more than one OS, you should make this switchable based on OS.
        Path path = getDefault().getPath("src/main/resources/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver",path.toString());
        WebDriver driver = new FirefoxDriver();
        //from here down is just a working example...
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();

        driver.close();


    }
}
