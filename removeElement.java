//27.移除元素
//拷贝覆盖
public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
}
//交换移除
public int removeElement(int[] nums, int val) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                nums[i]=nums[n-1];
                n--;
            }
        }
        return n;
    }
