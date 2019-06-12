package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法作为测试的一部分.
    @Test
    public void testCase1() {
        System.out.println("Test 这是测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("Test 这是测试用例2");
    }

    //这个注解是在每个带有@Test注解的测试方法之前运行的.
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod 这是在测试方法以前运行的");
    }

    //这个注解是在每个带有@Test注解的测试方法之后运行的.
    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod 这是在测试方法之后运行的");
    }

    //这个注解是在类运行之前运行的.
    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass 这是在类运行之前运行的");
    }

    //这个注解是在类运行之后运行的.
    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass 这是在类运行之后运行的");
    }

    //这个注解是包住类的, 在类运行之前运行的.
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite 测试套件");
    }

    ////这个注解是包住类的, 在类运行之后运行的.
    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite 测试套件");
    }
}
