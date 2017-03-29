package com.fqa;

import javax.servlet.Filter;

public class TestFilter {
	public static void main(String[] args) {
	    TestFilter test = new TestFilter();
	    boolean i = test.validVersion("3.0.6_20161207", "3.0.6");
	    System.out.println(i);
	}


	   public boolean validVersion(String configVersion, String clientVersion) {
	       String[] configParts = configVersion.split("_");
	       String[] clientParts = configVersion.split("_");



	        String[] configNumbers = configVersion.split("\\.");
	        String[] clientNumbers = clientVersion.split("\\.");
	        int configLen = configNumbers.length;
	        int clientLen = clientNumbers.length;
	        int minLen = configLen < clientLen ? configLen : clientLen;

	        for (int i = 0; i < minLen; i++) {
	            if (Integer.valueOf(clientNumbers[i]) < Integer.valueOf(configNumbers[i])) {
	                return false;
	            }else if (Integer.valueOf(clientNumbers[i]) > Integer.valueOf(configNumbers[i])) {
	                return true;
	            }
	        }

	        if (clientLen < configLen) {
	            return false;
	        }else {
	            return true;
	        }
	    }
}
