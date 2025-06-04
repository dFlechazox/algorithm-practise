package datas.exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays350 {                                        //双指针
    public static int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0, p2 = 0;
        int index = 0;
        int[] ans = new int[Math.min(nums1.length,nums2.length)];
        while (p1 < nums1.length && p2 < nums2.length){
            if (nums1[p1] != nums2[p2]){
                if (nums1[p1] < nums2[p2]){
                    p1++;
                }
                else {
                    p2++;
                }
            }
            if (nums1[p1] == nums2[p2]){
                ans[index]= nums1[p1];
                p1++;
                p2++;
                index++;
            }
        }
        return ans;
    }

    public int[] intersect1(int[] nums1, int[] nums2){                                        //哈希表
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
}
