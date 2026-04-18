package com.learning.tests;

import com.learning.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        driver.get("https://www.orangehrm.com/");
        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
    }
}