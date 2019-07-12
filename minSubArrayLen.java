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
