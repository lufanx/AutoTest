package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /*
    * 什么时候用到异常测试？
    * 在我们期望结果为某一个异常时.
    * 比如: 我们传如了一些不合法的参数，程序抛出了异常.
    * 也就是说我的预期结果就是这个异常.
    */

    //测试结果会失败的异常测试.
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("这是一个失败的异常测试.");
    }

    //测试结果成功的异常测试.
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("这是一个成功的异常测试.");
        throw new RuntimeException();
    }
}
