package com.learning.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
        protected WebDriver driver;

        @BeforeMethod
        @Parameters("browser")
        public void setUp(String browser) {

            browser = System.getProperty("browser", browser);

            if(browser == null || browser.isEmpty()) {
                browser = "chrome";
            }

            switch (browser.toLowerCase()) {
                case "chrome" -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                default -> throw new IllegalArgumentException("Browser not supported: " + browser);
            }

            driver.manage().window().maximize();
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }


}
