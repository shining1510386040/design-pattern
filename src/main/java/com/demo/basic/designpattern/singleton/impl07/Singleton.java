package com.demo.basic.designpattern.singletonPattern.impl07;

/**
 * @author Wenyi Cao
 * @version 1.0
 * @link
 * @description 单例模式实现方式7-枚举实现
 * <p>
 * 通过JDK1.5中添加的枚举来实现单例模式，写法简单，
 * 且不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * @date 2021/12/8 11:28
 * @see
 */
public enum Singleton {

    INSTANCE;

    public void whateverMethod() {
    }

}
