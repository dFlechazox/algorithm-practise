package datas.sort;

public class Mergesort extends SortAlgorithm{
    @Override
    public void sort(Comparable[] objs) {
    }
    public  void mergeSort(Comparable[] a,int s,int e){
        int m = (s + e) / 2;
        if (s < e){
            mergeSort(a,s,m);
            mergeSort(a,m+1,e);
            //归并
            merge(a,s,m,e);
        }
    }
    private  void merge(Comparable[] a, int s, int m, int e) {
        //初始化一个从起始s到终止e的一个数组
        Comparable[] temp = new Comparable[(e - s) + 1];
        //左起始指针
        int l = s;
        //右起始指针
        int r = m+1;
        int i = 0;
        //将s-e这段数据在逻辑上一分为二,l-m为一个左边的数组,r-e为一个右边的数组,两边都是有序的
        //从两边的第一个指针开始遍历,将其中小的那个值放在temp数组中
        while (l <= m && r <= e){
            if (less(a[l],a[r])){
                temp[i++] = a[l++];
            }else{
                temp[i++] = a[r++];
            }
        }
        //将两个数组剩余的数放到temp中
        while (l <= m){
            temp[i++] = a[l++];
        }
        while (r <= e){
            temp[i++] = a[r++];
        }
        //将temp数组覆盖原数组
        for (int n = 0; n < temp.length; n++) {
            a[s+n] = temp[n];
        }
    }
}
