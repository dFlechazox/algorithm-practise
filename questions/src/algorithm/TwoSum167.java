package algorithm;

public class TwoSum167 {
    public static int[] twosum(int[] nums,int target){                //暴力枚举
        int n=nums.length;
        int ans[]=new int[2];
        int index1,index2;
        for (index1=0;index1<=n;index1++){
            for (index2=index1+1;index2<=n;index2++){
                if (nums[index1]+nums[index2]==target){
                    ans[0]=index1;
                    ans[1]=index2;
                }
            }
        }
        return ans;
    }

    public static int[] Twosum(int[] nums,int target){                 //先确定一个数然后二分查找
        int n = nums.length;
        for (int i=0;i<n;i++){
            int low = i ,high = n-1;
            int mid = (high-low)/2 + low;
            while (low<high){
                if (nums[mid] == target-nums[low]){
                    return new int[] {low,mid};
                }
                else if (nums[mid] < target-nums[low]){
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSum(int[] nums,int target){                 //双指针
        int n = nums.length;
        int low = 0, high = n-1;
        while (low < high){
            if (nums[low] + nums[high] == target){
                return new int[] {low,high};
            }
            else if (nums[low] + nums[high] < target){
                low++;
            }
            else {
                high--;
            }
        }
        return new int[0];
    }
}
