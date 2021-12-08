package com.demo.basic.designpattern.singletonPattern.impl05;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 单例类实现方式5：懒汉式变种（在获取对象实例的时候才去初始化对象）；线程安全
 * <p>
 * 优点：线程安全；延迟加载；效率较高。
 * <p>
 * 由于 JVM 具有指令重排的特性，在多线程环境下可能出现 singleton 已经赋值但还没初始化的情况，导致一个线程获得还没有初始化的实例。volatile 关键字的作用：
 * <p>
 * 保证了不同线程对这个变量进行操作时的可见性
 * 禁止进行指令重排序
 * @date 2021/12/8 10:55
 * @see
 */
public class Singleton {

    /**
     * 1.持有本类实例的一个引用：初始化放在获取单例类的静态方法中
     * <p>
     * volatile 修饰，保证多个线程之间instance的可见性
     */
    private static volatile Singleton instance;


    /**
     * 2.构造方法私有化：防止外部new创建 类的实例
     */
    private Singleton() {

    }

    /**
     * 3.对外提供一个获取单例类的静态方法（双重检查锁）
     */
    public static Singleton getInstance() {
        if (instance == null) {
            // 临界区变小，锁粒度小
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
