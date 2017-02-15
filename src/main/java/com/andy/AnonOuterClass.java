package com.andy;

public class AnonOuterClass {
    
    public AnonInnerClass getInnerClass(final int num, String str) {
        return new AnonInnerClass() {
            int number = num + 3;
            public int getNumber() {
                return number;
            }
        };
    }
    
    public static void main(String[] args) {
        MyInterface inter = new MyInterface() {
            
            @Override
            public void speek() {                
                System.out.println("I am the handsome man...");
            }
        };
        
        inter.speek();
        Runnable thread = new Runnable() {
            
            @Override
            public void run() {
                // TODO Auto-generated method stub
                
            }
        };
        Thread t = new Thread(thread);
        t.start();
    }
}

class AnonInnerClass {
    private String non;
    
}
