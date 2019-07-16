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
//环状替换
public void rotate(int[] nums, int k) {
        k%=nums.length;
        int prev=0;
        int current=0;
        int count=0;
        int next=0;
        int temp=0;
        for(int start=0;count<nums.length;start++){
            prev=nums[start];
            current=start;
            do{
                next=(current+k)%nums.length;
                temp=nums[next];
                nums[next]=prev;
                prev=temp;
                current=next;
                count++;
            }while(current!=start);
        }
    }
