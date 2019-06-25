//1.两数之和
class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int targetNum[]=new int[2];
        for(int i=0;i<nums.length;i++){     
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    targetNum[0]=i;
                    targetNum[1]=j;
                }
            }
        }
        return targetNum;
    }
}
