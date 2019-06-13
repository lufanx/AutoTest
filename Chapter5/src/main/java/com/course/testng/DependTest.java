package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1() {
        System.out.println("test1 run.");
    }

    //test2依赖test1，执行test2时会先执行test1.
    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("test2 run.");
    }

    @Test
    public void test3() {
        System.out.println("test3 run.");
        throw new RuntimeException();
    }

    //test4依赖于test3， 如果test3失败(上边的就是抛出了异常), test4将会被忽略，不会被执行.
    @Test(dependsOnMethods = {"test3"})
    public void test4() {
        System.out.println("test4 run.");
    }
}
