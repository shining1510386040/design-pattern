package com.demo.basic.designpattern.decorator;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 测试
 * @date 2021/12/8 14:17
 * @see
 */
public class MainTest {

    public static void main(String[] args) {
        // 煎饼
        ABattercake aBattercake = new Battercake();

        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        // 煎饼加一个鸡蛋加一个鸡蛋加一个香肠价格：12
        System.out.println(aBattercake.getDesc() + "价格：" + aBattercake.cost());
    }


}
