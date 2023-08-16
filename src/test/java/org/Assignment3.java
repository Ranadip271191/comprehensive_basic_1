package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment3 extends BaseClass{

    @Test
    public void GooglePageTest() throws InterruptedException {
        String Expected_GoogleSearchButtonName = "Google Search";
        String Expected_IamFeelingLuckeyButtonName = "I'm Feeling Lucky";
        Boolean logo = driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]")).isDisplayed();
        Assert.assertEquals(logo,Boolean.TRUE);
        Boolean SearchBox = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).isDisplayed();
        Assert.assertEquals(SearchBox,Boolean.TRUE);
        String Actual_GoogleSearchButtonName = driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]/center/input[@class=\"gNO89b\"]")).getAttribute("value");
        Assert.assertEquals(Expected_GoogleSearchButtonName,Actual_GoogleSearchButtonName,"Google search Button name did not match");
        String Actual_IamFeelingLuckeyButtonName = driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]/center/input[@class=\"RNmpXc\"]")).getAttribute("value");
        Assert.assertEquals(Expected_IamFeelingLuckeyButtonName,Actual_IamFeelingLuckeyButtonName,"I'm Feeling Lucky Button name did not match");

    }

}
