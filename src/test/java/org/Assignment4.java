package org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment4 extends BaseClass{

    @Test
    public void W3SchoolsTest() throws InterruptedException {
        String Expected_W3schoolsURL = "https://www.w3schools.com/";
        if(driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).isDisplayed()){
            WebElement w3schools  =driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
            w3schools.sendKeys("W3Schools");
            w3schools.sendKeys(Keys.ENTER);
           Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class=\"eKjLze\"]/div/div/div/div/div/a/h3")).click();
            System.out.println(driver.getCurrentUrl());
            Assert.assertEquals(Expected_W3schoolsURL,driver.getCurrentUrl(),"w3school did not match");
        }

    }

}
