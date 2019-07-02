//67.二进制求和
public String addBinary(String a, String b) {
        int r=0;
        StringBuilder res=new StringBuilder();
        for(int i=a.length()-1,j=b.length()-1;i>=0||j>=0;i--,j--){
            int sum=r;
            sum+=i>=0?a.charAt(i)-'0':0;
            sum+=j>=0?b.charAt(j)-'0':0; 
            res.append(sum%2);
            r=sum/2;
        }
        res.append(r==1?r:" ");
        return res.reverse().toString();
    }
