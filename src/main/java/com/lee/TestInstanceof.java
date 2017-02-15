package com.lee;

public class TestInstanceof {
    public static void main(String[] args) {
        TestInstanceof test = new TestInstanceof();
        if (test instanceof TestInstanceof) {
            System.out.println("test is the instance of TestInstanceof");
            System.out.println(test.getClass().getSimpleName());
        }
    }
}
