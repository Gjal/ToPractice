//14.最长公共前缀
//方法一.LSP(LSP(LSP(S1,S2),S3)...Sn) 水平扫描法
public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0) return "";
            }
        }
        return prefix;
    }
//方法二.S1[0]-S2[0]-S3[0]....     水平扫描法
public String longestCommonPrefix(String[] strs) {
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(strs[0].charAt(i)!=strs[j].charAt(i)||i==strs[j].length()-1){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
//方法三.分治  
 public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null) return "";
        return longestCommonPrefix(strs,0,strs.length-1);
    }
    private String longestCommonPrefix(String[] strs,int l,int r){
        if(l==r)
            return strs[l];
        else{
            int mid=(l+r)/2;
            String lcpLeft=longestCommonPrefix(strs,l,mid);
            String lcpRight=longestCommonPrefix(strs,mid+1,r);
            return commonPrefix(lcpLeft,lcpRight);
        }
    }
    private String commonPrefix(String s1,String s2){
        int minLen=Math.min(s1.length(),s2.length());
        for(int i=0;i<minLen;i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return s1.substring(0,i);
        }
        return s1.substring(0,minLen);
    }
//方法四．二分查找法
 public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null) return "";
        int minLen=Integer.MAX_VALUE;
        for(String str:strs)
            minLen=Math.min(str.length(),minLen);
        int low=1;
        int high=minLen;
        while(low<=high){
            int mid=(low+high)/2;
            if(isCommonPrefix(strs,mid))
                low=mid+1;
            else
                high=mid-1;
        }
        return strs[0].substring(0,(low+high)/2);
    }
    private boolean isCommonPrefix(String[] strs,int len){
        String str1=strs[0].substring(0,len);
        for(int i=1;i<strs.length;i++){
            if(!strs[i].startsWith(str1))
                return false;
        }
        return true;
    }
