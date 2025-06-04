package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {         //使用双指针，主要是去重的逻辑要搞懂
    public List<List<Integer>> threeSum(int[] nums){        //a+b+c=0
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                return res;
            }
            if (i > 0 && nums[i] == nums[i - 1]){       //对a去重
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0){
                    right--;
                }
                else if (sum < 0){
                    left++;
                }
                else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]){left++;}       //对b、c去重
                    while (left < right && nums[right] == nums[right - 1]){right--;}
                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}
