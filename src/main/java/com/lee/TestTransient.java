package com.lee;

import java.io.Serializable;

import org.apache.commons.lang3.SerializationUtils;

public class TestTransient implements Serializable{
    private static final long serialVersionUID = 1710417061934602991L;
    private String name;
    private int age;
    private String city;
    private transient String password;

    public TestTransient(String name, int age, String city, String password) {
        super();
        this.name = name;
        this.age = age;
        this.city = city;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TestTransient [name=" + name + ", age=" + age + ", city=" + city + ", password=" + password + "]";
    }

    public static void main(String[] args) {
        TestTransient tt = new TestTransient("one", 20, "hubei", "123456");
        System.out.println(tt);
        byte[] bs = SerializationUtils.serialize(tt);
        TestTransient test = (TestTransient)SerializationUtils.deserialize(bs);
        System.out.println(test);
    }
}
