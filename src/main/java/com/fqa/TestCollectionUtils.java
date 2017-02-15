package com.fqa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

public class TestCollectionUtils {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        boolean empty = CollectionUtils.isEmpty(list);
        System.out.println(empty);
    }
}
