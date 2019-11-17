package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @Test
    public void test1(){

        System.out.println("First Assertion");
        Assert.assertEquals("one","onE");

        System.out.println("Second Assertion");
        Assert.assertEquals("title","title");
    }
    @Test
    public void test2(){

    //verify that title starts with C
        String actualTitle="Cybertek";
        String expectedTitleBeginning="C";

        System.out.println("second test first assertion");
        Assert.assertTrue(actualTitle.startsWith(expectedTitleBeginning), "verift title starts with C");

        Assert.assertTrue("isa@hotmail.com".contains("@"));

    }
    @Test
    public void test3(){
        Assert.assertNotEquals("one","two","one souldnt be equal to another");
        
    }

    @Test
    public void test4(){
        Assert.assertFalse(1<0);
    }


}
