package com.lee;

import com.andy.OuterClass;

public class TestClass {
    private String one;
    protected String two;
    public String three;
    String four;

    public TestClass(){};
    
    public TestClass(String one, String two, String three, String four) {
        super();
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
    }
    
    private void testPrivate() {
        System.out.println("private");
    }
    
    protected final void testProtected() {
        System.out.println("protected");
    }
    
    void testDefault() {
        System.out.println("default");
    }
    
    public void testPublic() {
        System.out.println("public");
    }

    public String getFour() {
        return four;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((four == null) ? 0 : four.hashCode());
        result = prime * result + ((one == null) ? 0 : one.hashCode());
        result = prime * result + ((three == null) ? 0 : three.hashCode());
        result = prime * result + ((two == null) ? 0 : two.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TestClass other = (TestClass) obj;
        if (four == null) {
            if (other.four != null)
                return false;
        } else if (!four.equals(other.four))
            return false;
        if (one == null) {
            if (other.one != null)
                return false;
        } else if (!one.equals(other.one))
            return false;
        if (three == null) {
            if (other.three != null)
                return false;
        } else if (!three.equals(other.three))
            return false;
        if (two == null) {
            if (other.two != null)
                return false;
        } else if (!two.equals(other.two))
            return false;
        return true;
    }
    
    public static void main(String[] args) {
        
    }

}
