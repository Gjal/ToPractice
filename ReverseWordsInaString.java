//151.reverse words in a String
public String reverseWords(String s) {
        s=s.trim();
        int i=s.length()-1;
        int j=s.length();
        StringBuffer res=new StringBuffer();
        for(;i>0;i--){
            if(s.charAt(i)==' '){
                res.append(s.substring(i+1,j));
                res.append(" ");
                while(s.charAt(i)==' ') i--;
                j=i+1;
            }
        }
        return res.append(s.substring(0,j)).toString();
    }
