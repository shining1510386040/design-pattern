package com.demo.basic.designpattern.singletonPattern.impl06;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 单例类实现方式6：静态内部类（利用类加载器来实现懒加载）；线程安全
 * <p>
 * 优点：避免了线程不安全，延迟加载，效率高。
 * <p>
 * 静态内部类的方式利用了类装载机制来保证线程安全，只有在第一次调用getInstance方法时，才会装载SingletonInstance内部类，完成Singleton的实例化，所以也有懒加载的效果。
 * @date 2021/12/8 10:55
 * @see
 */
public class Singleton {

    /**
     * 1.构造方法私有化
     */
    private Singleton() {

    }

    /**
     * 2.持有一个静态内部类，维护一个单例类的实例
     */
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 3.提供获取单例实例的静态方法
     */
    public static Singleton getInstance() {
        // 利用了类装载机制来保证线程安全
        return SingletonInstance.INSTANCE;
    }
}
