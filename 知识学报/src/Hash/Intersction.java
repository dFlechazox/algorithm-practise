package Hash;

import java.util.HashSet;
import java.util.Set;

public class Intersction {
    public int[] intersection(int[] nums1, int[] nums2){        //使用set，对于数据较大或者数据较为分散的，不宜使用数组，可使用set
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i : nums1){
            set.add(i);
        }
        for (int i : nums2){
            if (set.contains(i)){
                res.add(i);
            }
        }
        //return res.stream().mapToInt(x -> x).toArray();       将结果集合转化为数组

        int[] arr =new int[res.size()];     //申请一个新的数组存放res中的结果
        int j = 0;
        for (int i : res){
            arr[j++] = i;
        }
        return arr;
    }

    public int[] intersection1(int[] nums1, int[] nums2){       //使用数组，因为题目规定了测试数据的大小，本题数据较小可以使用数组
        int[] hash1 =new int[1002];
        int[] hash2 =new int[1002];
        Set<Integer> res = new HashSet<>();
        for (int i : nums1){
            hash1[i]++;
        }
        for (int i : nums2){
            hash2[i]++;
        }
        for (int i = 0; i < 1002; i++){
            if (hash1[i] > 0 && hash2[i] > 0){
                res.add(i);
            }
        }
        return res.stream().mapToInt(x -> x).toArray();
    }
}
