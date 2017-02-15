package com.lee;

public class TestExtends extends TestClass {

    public TestExtends(String one, String two, String three, String four, String five) {
        super(one, two, three, four);
        this.five = five;
    }

    private String five;

    public String getFive() {
        return five;
    }

    public void setFive(String five) {
        this.five = five;
    }
    
//    public void testProtected() {
//        
//    }
    
    public void testPublic() {
        
    }    

    public static void main(String[] args) {
        TestExtends test = new TestExtends("one", "two", "three", "four", "five");
        System.out.println(test.two);
        System.out.println(test.three);
        System.out.println(test.four);
        System.out.println(test.five);
        
        test.testDefault();
        test.testProtected();
        test.testPublic();
    }
}
