package org;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver driver;
    @BeforeClass
    @Parameters("BrowserName")
    public void LaunchBrowser(String BrowserName){
        String path = System.getProperty("user.dir");
        if (BrowserName.equals("Safari")){
            driver = new SafariDriver();
        }else if (BrowserName.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver", path+"/chromedriver");
            driver = new ChromeDriver();
        } else if (BrowserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver",path+"/geckodriver");
            driver = new FirefoxDriver();
        }
    }
    @BeforeMethod
    public void openURL(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }
    @AfterMethod
    public void closeBrowserWindow(){
        driver.quit();
    }
}
