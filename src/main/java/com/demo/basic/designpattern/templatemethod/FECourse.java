package com.demo.basic.designpattern.templatemethod;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description FECourse
 * @date 2021/12/8 15:09
 * @see
 */
public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("4.1 提供课程的前端代码");
        System.out.println("4.2 提供课程的图片等多媒体素材");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
