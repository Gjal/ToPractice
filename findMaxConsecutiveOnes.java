 //485.最大连续1的个数
 public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                j++;
            }else{
                res=(res>j)?res:j;
                j=0;
            }
        }
        return (res>j)?res:j;
    }


