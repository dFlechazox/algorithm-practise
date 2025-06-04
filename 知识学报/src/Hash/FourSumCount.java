package Hash;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1){
            for (int j : nums2){
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        for (int i : nums3){
            for (int j : nums4){
                res += map.getOrDefault(0 - i - j, 0);              //返回对应key值的value，若没有key值，则返回默认值
            }
        }
        return res;
    }
}
