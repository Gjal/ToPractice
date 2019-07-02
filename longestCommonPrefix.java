//14.最长公共前缀
//方法一.LSP(LSP(LSP(S1,S2),S3)...Sn)
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
//方法二.S1[0]-S2[0]-S3[0]....
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
