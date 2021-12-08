package com.demo.basic.designpattern.templatemethod;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 课程抽象类
 * @date 2021/12/8 15:04
 * @see
 */
public abstract class ACourse {

    /**
     * 讲一个课程的基本流程
     * makeCourse 方法是模板方法，
     * 它定义了制作网课的基本流程，makePPT、makeVideo、writeArticle 这三个步骤在所有课程中都是固定的，
     * 所以用 final 关键字修饰；
     * packageCourse 方法在所有课程中都可能不一样，所以声明为抽象方法，由子类自行实现；
     * 钩子方法 needWriteArticle 返回一个 boolean 类型的值，控制是否编写课程笔记
     *
     */
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("1. 制作PPT");
    }

    final void makeVideo() {
        System.out.println("2. 制作视频");
    }

    final void writeArticle() {
        System.out.println("3. 编写课程笔记");
    }

    //钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
