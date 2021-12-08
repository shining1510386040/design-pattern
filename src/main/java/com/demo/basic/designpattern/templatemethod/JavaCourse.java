package com.demo.basic.designpattern.templatemethod;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description Java课程
 * @date 2021/12/8 15:08
 * @see
 */
public class JavaCourse extends ACourse {

    @Override
    void packageCourse() {
        System.out.println("4. 提供Java课程源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}