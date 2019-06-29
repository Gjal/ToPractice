//28.实现strStr()
//方法一：暴力破解
public class Implement_strStr {
	 public int strStr(String haystack, String needle) {
	        char[] hays=haystack.toCharArray();
	        char[] need=needle.toCharArray();
	        int l1=hays.length;
	        int l2=need.length;
	        int i=0;
	        int j=0;
	        while(i<l1&&j<l2) {
	            if(hays[i]==need[j]) {
	            	i++;
	            	j++;
	            }else {
	            	i=i-j+1;
	            	j=0;
	            }
	        }
	        if(j==l2) {
	        	return i-j;
	        }else {
	        	return -1;
	        }
	    }
}
