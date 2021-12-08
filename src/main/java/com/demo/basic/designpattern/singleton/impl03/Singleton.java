package com.demo.basic.designpattern.singletonPattern.impl03;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 单例类实现方式3：懒汉式（在获取对象实例的时候才去初始化对象）；线程不安全
 * <p>
 * 优点：懒加载，启动速度快、如果从始至终都没使用过这个实例，则不会初始化该实力，可节约资源
 * <p>
 * 缺点：多线程环境下线程不安全。if (singleton == null) 存在竞态条件，可能会有多个线程同时进入 if 语句，导致产生多个实例
 * @date 2021/12/8 10:55
 * @see
 */
public class Singleton {

    /**
     * 1.持有本类实例的一个引用：初始化放在获取单例类的静态方法中
     */
    private static Singleton instance;


    /**
     * 2.构造方法私有化：防止外部new创建 类的实例
     */
    private Singleton() {

    }

    /**
     * 3.对外提供一个获取单例类的静态方法
     */
    public static Singleton getInstance() {
        // 此处多线程环境下不安全，有可能会是系统产生多个Singleton类的实例
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
