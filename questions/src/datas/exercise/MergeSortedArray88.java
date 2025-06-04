package datas.exercise;

import java.util.Arrays;

public class MergeSortedArray88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n){                     //正常人解法
        for (int i = 0;i < n;i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public void merge1(int[] nums1, int m, int[] nums2, int n){                           //双指针，但需要一个临时变量sort
        int p1 = 0, p2 = 0;
        int[] sort = new int[m+n];
        int cur = 0;
        while (p1 < m || p2 < n){
            if (p1 == m){
                cur = nums2[p2++];
            }
            else if (p2 == n){
                cur = nums1[p1++];
            }
            else if (nums1[p1] <= nums2[p2]){
                cur = nums1[p1++];
            }
            else if (nums2[p2] < nums1[p1]){
                cur = nums2[p2++];
            }
            sort[p1+p2-1] = cur;
        }
        for (int i = 0; i < m+n; i++){
            nums1[i] = sort[i];
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n){                          //逆双指针，不需要临时变量，可以保证nums[1]中元素不会被覆盖
        int p1 = m-1, p2 = n-1;
        int cur = 0;
        int tail = m+n-1;
        while (p1 >= 0 || p2 >= 0){
            if (p1 == -1){
                cur = nums2[p2--];
            }
            else if (p2 == -1){
                cur = nums1[p1--];
            }
            else if (nums1[p1] >= nums2[p2]){
                cur = nums1[p1--];
            }
            else if (nums2[p2] >= nums1[p1]){
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }
}
