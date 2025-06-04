package datas.exercise;

public class BestTimeStock121 {
    public int maxProfit(int[] prices){                         //暴力法
        int n = prices.length;
        int max = 0;
        for (int i = 0;i < n; i++){
            for (int j = i+1;j < n; j++){
                if (prices[j]-prices[i] > max){
                    max = prices[j]-prices[i];
                }
            }
        }
        return max;
    }

    public int maxProfit1(int[] prices){                    //一次遍历，先找到最小值
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0;i < prices.length;i++){
            if (prices[i] < min){
                min = prices[i];
            }
            else if (prices[i]-min > max){
                max = prices[i]-min;
            }
        }
        return max;
    }
}
