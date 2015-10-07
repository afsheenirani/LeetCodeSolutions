package com.ai.easy;

public class CountAndSay {
	public String countAndSay(int n) {
		if(n<=0)
            return("");
            
        String num = "1";
        if(n>1) {
            for(int i=1; i<n; i++) { // nth sequence
                String newNum = "";
                int k=0;
                while(k<num.length()) {
                    String val = num.substring(k,k+1);
                    int count = 0;
                    for(int j=k; j<num.length(); j++) { // counting
                        if(val.equals(num.substring(j,j+1))) {
                            count++;
                            k++;
                        }
                        else {
                            newNum += String.valueOf(count);
                            newNum += val;
                            count = 0;
                            break;
                        }
                    }
                    if(count > 0)
                    	newNum += String.valueOf(count) + val;
                }
                
                num = newNum;
            }
        }
        
        return(num);
    }
}
