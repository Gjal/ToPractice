//189.旋转数组
//暴力破解
public void rotate(int[] nums, int k) {
        int prev=0;
        int n=nums.length;
        k%=n;
        int temp=0;
        for(int i=0;i<k;i++){
            prev=nums[n-1];
            for(int j=0;j<nums.length;j++){
                temp=nums[j];
                nums[j]=prev;
                prev=temp;
            }
        }
    }
//额外数组
public void rotate(int[] nums, int k) {
        int[] b=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            b[(i+k)%nums.length]=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=b[j];
        }
    }
