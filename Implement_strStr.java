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

//方法二．kmp算法
public int strStr(String haystack, String needle) {
        int i=0;
        int j=0;
        char[] hays=haystack.toCharArray();
        char[] need=needle.toCharArray();
        int[] next=getNext(need);
        while(i<hays.length&&j<need.length){
            if(hays[i]==need[j]){
                i++;
                j++;
            }else{
                if(j==0)
                    i++;
                else
                    j=next[j-1];
            }
        }
        if(j==need.length)
            return i-j;
        else
            return -1;
        
    }
    public int[] getNext(char[] needle){
        int i=1;
        int j=0;
        int[] next=new int[needle.length];
        while(i<needle.length){
            if(needle[i]==needle[j]){
                next[i]=j+1;
                i++;
                j++;
            }else{
                if(j!=0)
                    j=next[j-1];
                else{
                    next[i]=0;
                    i++;
                }
            }
        }
        return next;
    }
