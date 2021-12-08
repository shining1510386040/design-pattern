package com.demo.basic.designpattern.decorator;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 香肠装饰器
 * @date 2021/12/8 14:15
 * @see
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
