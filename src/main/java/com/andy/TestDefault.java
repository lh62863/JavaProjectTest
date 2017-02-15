package com.andy;

import com.lee.TestClass;

public class TestDefault extends TestClass {
    public TestDefault(String one, String two, String three, String four, String six) {
        super(one, two, three, four);
        this.six = six;
    }
    
    public TestDefault(){};

    private String six;

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public static void main(String[] args) {
        TestDefault test = new TestDefault("one", "two", "three", "four", "six");
        System.out.println(test.two);
        System.out.println(test.three);
        System.out.println(test.six);
        
        test.testPublic();
        test.testProtected();
    }

}

class MyDefault {
    private String my;

    public String getMy() {
        return my;
    }

    public void setMy(String my) {
        this.my = my;
    }
    
    public void speek() {
        System.out.println("speek");
    }
    
    public static void main(String[] args) {
        TestDefault test = new TestDefault();
        test.testPublic();
    }
}

abstract class MyAbstract {
    
}

final class MyFinal {
    
}
