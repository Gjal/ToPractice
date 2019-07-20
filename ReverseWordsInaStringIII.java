 //557.Reverse Words in a StringIII
 //reverse()
public String reverseWords(String s){
        String res="";
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            if(i==str.length-1){
                res+=new StringBuffer(str[i]).reverse().toString();
            }else{
                res+=new StringBuffer(str[i]).reverse().append(" ").toString();
            }
        }
        return res;
    }
    //双指针
public String reverseWords(String s){
        if(s==null||s.length()<2) return s;
        int l=0;
        int r=0;
        char[] ch=s.toCharArray();
        for(int k=0;k<ch.length;k++){
            if(ch[k]==' '){
                while(l<r){
                    char temp=ch[l];
                    ch[l]=ch[r];
                    ch[r]=temp;
                    l++;
                    r--;     
                }
                l=k+1;
                r=k+1;
            }else{
                r=k;
            }
        }
        while(l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;     
        }
        return new String(ch);
    }

//双指针2
public String reverseWords(String s) {
        if(s.trim().length()==0) return s;
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            char[] ch=str[i].toCharArray();
            int l=0;
            int r=ch.length-1;
            while(l<r){
                char temp=ch[l];
                ch[l++]=ch[r];
                ch[r--]=temp;
            }
            str[i]=String.valueOf(ch);
        }
        return String.join(" ",str);
    }

