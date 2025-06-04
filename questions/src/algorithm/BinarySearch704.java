package algorithm;

public class BinarySearch704 {
    //顺序
    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //二分
    public static int bsearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;    //*
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid+1;                       //*
            } else {
                right = mid-1;                      //*
            }
        }
        return -1;
    }
}