package com.demo.basic.designpattern.singletonPattern.impl01;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 单例类实现方式1：恶汉式；线程安全
 * <p>
 * 优点：简单，使用时没有延迟；在类装载时就完成实例化，天生的线程安全
 * <p>
 * 缺点：没有懒加载，启动较慢；如果从始至终都没使用过这个实例，则会造成内存的浪费。
 * @date 2021/12/8 10:55
 * @see
 */
public class Singleton {

    /**
     * 1.持有本类实例的一个引用：并且new创建对象（恶汉）
     */
    private static final Singleton INSTANCE = new Singleton();

    /**
     * 2.构造方法私有化：防止外部new创建 类的实例
     */
    private Singleton() {

    }

    /**
     * 3.对外提供一个获取单例类的静态方法
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }

}
