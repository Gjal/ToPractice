//167.两数之和--输入有序数组
public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] res=new int[2];
        int sum=0;
        while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum==target){
                res[0]=i+1;
                res[1]=j+1;
                break;
            }else if(sum>target){
                j--;
            }else{
                i++;
            }
        }
        return res;
     }
