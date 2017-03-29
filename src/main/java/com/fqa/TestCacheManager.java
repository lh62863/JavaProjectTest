package com.fqa;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class TestCacheManager {
    @JSONField(ordinal = 2)
    private String two;
    @JSONField(ordinal = 3)
    private String three;
    @JSONField(ordinal = 1, name = "ONE", serialize = false)
    private String one;
    
    public TestCacheManager() {
        // TODO Auto-generated constructor stub
    }

    public TestCacheManager(String two, String three, String one) {
        super();
        this.two = two;
        this.three = three;
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

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    public static void main(String[] args) {
        // CacheManager manager = new ConcurrentMapCacheManager();
        TestCacheManager test = new TestCacheManager("two", "three", "one");
        System.out.println(test.toString());
        TestCacheManager t = JSON.parseObject(test.toString(), TestCacheManager.class);
        System.out.println(t.toString());
    }
}
