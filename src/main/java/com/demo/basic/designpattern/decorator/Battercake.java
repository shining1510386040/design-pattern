package com.demo.basic.designpattern.decorator;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 煎饼类
 * @date 2021/12/8 14:00
 * @see
 */
public class Battercake extends ABattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
