//209.长度最小的子数组
//双指针
public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0||nums==null) return 0;
        int sum=0;
        int left=0;
        int len=nums.length+1;
        int i;
       for( i=0;i<nums.length;i++){
           sum+=nums[i];
           while(sum>=s){
               len=len>(i-left+1)?(i-left+1):len;
               sum-=nums[left++];
           }
       }
        return (len!=nums.length+1)?len:0;
    }
//暴力破解
public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0||nums==null) return 0;
        
        int sum=0;
        int res=nums.length+1;
        for(int i=0;i<nums.length;i++){
            sum=nums[i];
            if(sum>=s) return 1;
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum>=s){
                    res=res>(j-i+1)?(j-i+1):res;
                    break;
                } 
            }
        }
        return (res!=nums.length+1)?res:0;
    }
