public int pivotIndex(int[] nums) {
        int sum=0;
        int leftSum=0;
        int rightSum=0;
        
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            if(i==0){
                leftSum=0;
            }
            else{
                leftSum=leftSum+nums[i-1];
            }
            
            rightSum=sum-leftSum-nums[i];
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }