package com.demo.basic.designpattern.decorator;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 鸡蛋装饰器
 * @date 2021/12/8 14:12
 * @see
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }

    public void egg() {
        System.out.println("增加了一个鸡蛋");
    }
}
