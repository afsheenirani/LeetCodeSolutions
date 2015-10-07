package com.ai.medium;

import java.util.*;

public class GroupAnagrams {
    public List<String> anagrams(String[] strs) {
        Map<String,List<String>> anagMap = new HashMap<>();
        for(int i=0; i < strs.length; i++) {
            String str = strs[i];
            String sorted = sort(str);
            if(anagMap.containsKey(sorted))
            {
                List<String> anags = anagMap.get(sorted);
                anags.add(str);
                anagMap.put(sorted,anags);
            }
            else {
                List<String> anags = new ArrayList<String>();
                anags.add(str);
                anagMap.put(sorted,anags);
            }
        }
        
        List<String> result = new ArrayList<String>();
        for(List<String> anags : anagMap.values()) {
            if(anags.size() > 1 )
                result.addAll(anags);
        }
        
        return(result);
    }
    
    public String sort(String input) {
        char[] c = input.toCharArray();
        Arrays.sort(c);
        return(new String(c));
    }
}
