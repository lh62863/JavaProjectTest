package com.lee;
/*
 * abstract修饰类，表示抽象类，抽象类中可以有非抽象方法，抽象类不能被实例化
 * abstract修饰方法，表示抽象方法，含有抽象方法的类必须被声明为抽象类，抽象方法必须被重写,
 * 抽象方法只能声明，不能实现
 * */
public abstract class TestAbstract {
    public void doOne() {
        System.out.println("one");
    };
    public abstract void doTwo();
}
