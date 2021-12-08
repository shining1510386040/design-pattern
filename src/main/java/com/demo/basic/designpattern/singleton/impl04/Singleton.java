package com.demo.basic.designpattern.singletonPattern.impl04;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 单例类实现方式4：懒汉式变种（在获取对象实例的时候才去初始化对象）；线程安全
 * <p>
 * 优点：解决了上一种实现方式的线程不安全问题
 * <p>
 * 缺点：synchronized 对整个 getInstance() 方法都进行了同步，每次只有一个线程能够进入该方法，并发性能极差
 * * @date 2021/12/8 10:55
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
    public static synchronized Singleton getInstance() {
        // 获取单例类的方法加上synchronized 同步锁，同步整合方法，临界区粒度太大，性能差
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
