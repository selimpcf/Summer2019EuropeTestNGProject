package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAndAfterTest {

    @Test
    public void test1(){
        System.out.println("This is my test one");
    }

    @Ignore
    @Test
    public void test2(){
        System.out.println("This is my test two");
    }

    @Test
    private void test3(){
        System.out.println("This is my test three");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("BEFORE METHOD");
        System.out.println("OPENING THE BROWSER");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("CLOSE BROWSER");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BEFORE CLOSE CODE");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AFTER CLASS CODE");
        System.out.println("REPORTING");
    }
}
