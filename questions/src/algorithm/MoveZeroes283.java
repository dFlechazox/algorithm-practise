package algorithm;

public class MoveZeroes283 {
    public static void movezeroes(int[] nums){               //双指针
        int n=nums.length;
        int left=0,right=0;
        while (right<n){
            if (nums[right]!=0){
                Nomal.swapia(nums,left,right);
                left++;
            }
            right++;
        }
    }


    public static void movezero(int[] nums){                  //双指针，直接覆盖，后续补0
        int n=nums.length;
        int left=0,right=0;
        while (right<n){
            if (nums[right]!=0){
                nums[left++]=nums[right];
            }
            ++right;
        }
        for (int i=left;i<n;i++){
            nums[i]=0;
        }
    }
}
