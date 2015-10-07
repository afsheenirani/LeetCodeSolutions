package com.ai.easy;

public class CompareVersionNumbers {
	public int compareVersion(String version1, String version2) {
        String regex = "\\.";
    	String[] v1 = version1.split(regex);
    	String[] v2 = version2.split(regex);

    	int len = Math.min(v1.length, v2.length);
    	
        for(int i=0; i < len; i++) {
        	Integer ver1 = Integer.parseInt(v1[i]);
        	Integer ver2 = Integer.parseInt(v2[i]);
        	
        	if(ver1 > ver2) {
        		return(1);
        	}
        	else if(ver1 < ver2) {
        		return(-1);
        	}
        }
        
        if(v1.length > v2.length) {
            for(int i = len; i < v1.length; i++) {
                if(Integer.parseInt(v1[i]) !=0 )
                    return(1);
            }
        }
        else if (v1.length < v2.length ) {
            for(int i = len; i < v2.length; i++) {
                if(Integer.parseInt(v2[i]) != 0 )
                    return(-1);
            }
        }
        
        return(0);
    }
}
