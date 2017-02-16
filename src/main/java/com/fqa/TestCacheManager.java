package com.fqa;

import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;

public class TestCacheManager {
    public static void main(String[] args) {
    	CacheManager manager = new ConcurrentMapCacheManager();
    	
    }
}
