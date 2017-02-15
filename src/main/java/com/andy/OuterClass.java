package com.andy;

public class OuterClass {
    private String name;
    private int age;

    public void show() {
        System.out.println("show something special...");
    }

    public class InnerClass {
        public String city;

        public OuterClass getOuterClass() {
            return OuterClass.this;
        }

        public InnerClass() {
            name = "chenssy";
            age = 23;
        }

        public void display() {
            System.out.println("name:" + name + ";age:" + age);
        }
    }

    public InnerClass getInnerClass() {
        return new InnerClass();
    }

    public static void main(String[] args) {
        OuterClass outClass = new OuterClass();
        OuterClass.InnerClass innerClass = outClass.new InnerClass();
        innerClass.display();
        innerClass.getOuterClass().show();
        outClass.getInnerClass().display();
    }
}
