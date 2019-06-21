//747.至少是其他数字两倍的最大数
class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        int half=max/2;
        for(int i=0;i<nums.length;i++){
            if(i==index) continue;
            if(nums[i]<=half){
                continue;
            }else{
                return -1;
            }
        }
        return index;
    }
}
