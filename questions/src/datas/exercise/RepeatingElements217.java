package datas.exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatingElements217 {
    public boolean repeat(int[] num) {
        Arrays.sort(num);                         //排序
        for (int i = 0; i < num.length; i++) {
            if(num[i]==num[i+1]){
                return true;
            }
        }
        return false;
    }

    public boolean repeat1(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}
