package com.lee;

public class TestSingleton {
    // 懒汉模式
//    private static TestSingleton test = new TestSingleton();
//    
//    private TestSingleton(){};
//    
//    public static TestSingleton getInstance() {
//        return test;
//    }
    
    // 饿汉模式
//    private static TestSingleton test = null;
//    
//    private TestSingleton(){};
//    
//    public synchronized static TestSingleton getInstance() {
//        if (test == null) {
//            test =  new TestSingleton();
//        }
//        return test;
//    }
    
    // 优雅模式
    private volatile static TestSingleton test = null;
    
    private TestSingleton(){};
    
    public static TestSingleton getInstance() {
        if (test == null) {
            synchronized (TestSingleton.class) {
                if (test == null) {
                    test = new TestSingleton();
                }
            }
        }
        return test;
    }
}
