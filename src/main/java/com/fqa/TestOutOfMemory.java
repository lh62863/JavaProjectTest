package com.fqa;

import java.util.ArrayList;
import java.util.List;

public class TestOutOfMemory {
    public static void main(String[] args) {
        List<TestOutOfMemory> list = new ArrayList<TestOutOfMemory>();
        while (true) {
            TestOutOfMemory test = new TestOutOfMemory();
            list.add(test);
            System.out.println(list.size());
        }
    }
}
