package algorithm;

public class Nomal {
    public static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;
    }

    public static void swapia(int[] nums,int a,int b){
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }

    public static void swapchar(char[] s,int a,int b){
        char t = s[a];
        s[a] = s[b];
        s[b] = t;
    }
}
