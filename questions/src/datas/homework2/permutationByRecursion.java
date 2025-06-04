package datas.homework2;

import java.util.Scanner;

public class permutationByRecursion {
    public static void main(String[] args){
        char[] str ={'a','b','b','d'};
        printAllStrs(str,0);
    }
     //遍历打印 字符串
    private static void printCharArr(char[] str) {
        for (char c : str) {
            System.out.print(c + " ");
        }
        System.out.print("\n");
    }
    public static void  printAllStrs(char[] str,int index){
        if(index==str.length-1){
            //打印当前数组
            printCharArr(str);
            return;
        }

        for (int i = index; i < str.length; i++) {
            if(isCanSwap(index,i,str)){
                //将index之后的某个元素与index位置的原生进行交换
                //然后打印全排列
                swap(i,index,str);
                printAllStrs(str,index+1);
                //还原数据的位置
                swap(i,index,str);
            }
        }
    }

     //去重
    private static boolean isCanSwap(int start, int end, char[] str) {
        char target = str[end];
        while (--end>=start){
            if(str[start]== target)
                return false;
        }
        return true;
    }

     //交换位置
    public static void swap(int start,int end, char[] str){
        char tmp = str[start];
        str[start] = str[end];
        str[end] = tmp;
    }
}
