package com.cybertek.tests.day13_properties_driver_testbase;

import com.cybertek.tests.TestBase;
import org.testng.annotations.Test;

public class AnotherLoginTest extends TestBase {



    @Test
    public void test(){
        driver.get("www.google.com");
    }
}
