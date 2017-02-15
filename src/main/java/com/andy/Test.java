package com.andy;

public class Test {
    private static String name;
    
    public static void main(String[] args) {
        java.text.DecimalFormat   df   =new   java.text.DecimalFormat("0.00"); 
        System.out.println(df.format(1f/100));
        
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
        
        
    }
}
