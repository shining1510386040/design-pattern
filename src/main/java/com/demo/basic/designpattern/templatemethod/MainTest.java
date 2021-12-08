package com.demo.basic.designpattern.templatemethod;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 测试
 * @date 2021/12/8 15:10
 * @see
 */
public class MainTest {

    public static void main(String[] args) {
        System.out.println("Java课程start---");
        ACourse javaCourse = new JavaCourse();
        javaCourse.makeCourse();
        System.out.println("Java课程end---\n");


        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end---");
    }
}
