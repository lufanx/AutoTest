package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1() {
        System.out.println("GroupsOnClass2在stu1中运行");
    }

    public void stu2() {
        System.out.println("GroupsOnClass2在stu2中运行");
    }
}
