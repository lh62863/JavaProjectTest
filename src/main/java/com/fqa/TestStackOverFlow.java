package com.fqa;

public class TestStackOverFlow {
    public static void main(String[] args) {
        TestStackOverFlow testStackOverFlow = new TestStackOverFlow();
        testStackOverFlow.recusion(1);
    }
    
    public void recusion(int i) {
        System.out.println(i++);
        recusion(i);
    }
}
