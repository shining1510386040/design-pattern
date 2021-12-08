package com.demo.basic.designpattern.decorator;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 抽象装饰类-装饰煎饼
 * <p>
 * 抽象装饰类通过成员属性的方式将 煎饼抽象类组合进来，同时也继承了煎饼抽象类，且这里定义了新的业务方法 doSomething()
 * 1、is a 本身是一个抽象煎饼
 * @date 2021/12/8 14:03
 * @see
 */
public abstract class AbstractDecorator extends ABattercake {

    /**
     * 2.has a 持有一个抽象煎饼的引用
     */
    private ABattercake aBattercake;


    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }


    /**
     * 增强的方法
     */
    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        //3. use a
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
