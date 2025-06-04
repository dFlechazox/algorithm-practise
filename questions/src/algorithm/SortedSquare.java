package algorithm;

import java.util.Arrays;

public class SortedSquare {                                  //直接排序
    public static int[] sort(int[] nums) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[i] * nums[i];
        }
        Arrays.sort(a);
        return a;
    }

    public static int[] sort01(int[] nums){                 //双指针，类归并排序
        int neg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg=i;
            }
            else {
                break;
            }
        }
        for (int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        /*int[] a=new int[neg+1];
        int[] b=new int[nums.length-neg];
        for (int i=0;i<=neg;i++){
            a[i]=nums[i];
        }
        for (int i=neg+1;i<nums.length;i++){
            b[i]=nums[i];
        }*/
        int[] ans=new int[nums.length];
        int i=neg,j=neg+1;
        int index=0;
        while(i>=0 || j<nums.length){
            if (i<0){
                ans[index]=nums[j];
                j++;
            }
            if (j==nums.length){
                ans[index]=nums[i];
                i--;
            }
            if (nums[i]<nums[j]){
                ans[index]=nums[i];
                i--;
            }
            else {
                ans[index]=nums[j];
                j++;
            }
            index++;
        }
        return ans;
    }
}
