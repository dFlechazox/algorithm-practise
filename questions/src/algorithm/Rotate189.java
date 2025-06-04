package algorithm;


public class Rotate189 {
    public static void rotate(int[] nums,int k){                 //需要另一个数组，空间利用率为O(n)
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[(i+k)%n]=nums[i];                      //利用整除直接排序
        }
        System.out.print(ans);
    }

    public static void rotatearray(int[] nums, int k){          //环状替换
        int n = nums.length;
        k = k%n;
        int count = gcd(k,n);
        for (int i=0;i<count;i++){                            //确定所有元素都被遍历了
            int start = i;
            do {
                int t = nums[(start+k)%n];
                nums[(start+k)%n] = nums[start];
                nums[start] = t;
                start = (start+k)%n;
            }
            while (start!=i);
        }
        System.out.print(nums);
    }

    private static int gcd(int a, int b) {                           //最大公约数
        while (b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        return b;
    }

    public static void rotatearray1(int[] nums, int k){
        int n = nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,(k%n)-1);
        reverse(nums,k%n,n-1);
    }

    public static void reverse(int[] nums, int start, int end){
        while (start<end){
            Nomal.swap(start,end);
            start++;
            end--;
        }
    }
}
