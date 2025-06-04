package algorithm;

public class VersionControl278 {     //寻找第一个开始出错的版本，要求尽量减少检查接口的次数，因此不推荐用顺序查找，应该使用二分查找
    public static boolean isbadversion(int n){      //判断是否为错误版本，暂无实际内容，仅为后面调用使用
        return true;
    }
    public int firsibadversion(int n){
        int left=1,right=n;
        while (left<right){                          //无“=”，只要循环至左右端点相同
            int mid=(right-left)/2+left;
            if(isbadversion(mid)){
                right=mid;                            //需要这个为"true"的mid,所以直接=，不用+/-
            }
            else{
                left=mid+1;                           //不需要这个为"false"的mid，所以要+1
            }
        }
        return left;
    }
}
