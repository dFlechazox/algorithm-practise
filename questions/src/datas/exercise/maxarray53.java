package datas.exercise;

public class maxarray53 {
    public static int maxSubArray(int[] nums){                            //动态规划
        int ans = nums[0], pre = 0;
        int n = nums.length;
        for (int x : nums){
            pre = Math.max(pre, pre+x);
            ans = Math.max(pre, ans);
        }
        return ans;
    }
}
