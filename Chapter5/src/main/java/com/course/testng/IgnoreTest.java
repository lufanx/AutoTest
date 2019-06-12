package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignore1() {
        System.out.println("ignore1");
    }

    //忽略这条case，不让这条case执行.(enabled=false)
    @Test(enabled = false)
    public void ignore2() {
        System.out.println("ignore2");
    }

    //enabled默认为true，就是执行这条case.
    @Test(enabled = true)
    public void ignore3() {
        System.out.println("ignore3");
    }
}
