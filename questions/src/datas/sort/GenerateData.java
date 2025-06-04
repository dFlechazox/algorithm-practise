package datas.sort;

import java.util.Random;

public class GenerateData {
    public static final int UNIFORM = 1;
    public static final int KSORTED = 2;
    // 生成一个长度为N的均匀分布的数据序列
    public static Double[] getRandomData(int N){
        Double[] numbers = new Double[N];
        for(int i = 0; i < N; i++)
            numbers[i] = Math.random();
        return numbers;
    }
    // 生成一个K-sorted数据序列，其中该序列的长度为N，一般要求 K << N
    public static Double[] getKSortedData(int N, int K){
        Double[] numbers = new Double[N];
        double step = 1.0/N;
        numbers[0] = 0.0;
        for(int i = 1; i < N; i++)
            numbers[i] = numbers[i-1] + step;
        Random rand = new Random();
        int left = 0;
        int right = left + K;
        while(right < N){
            shuffle(numbers, left, right);
            left = right;
            right += K;
        }
        shuffle(numbers, left, N);
        return numbers;
    }
    // 将数组numbers中的[left,right)范围内的数据随机打乱
    private static void shuffle(Double[] numbers, int left, int right){
        int N = right - left;
        Random rand = new Random();
        for(int i = 0; i < N; i++){
            int j = i + rand.nextInt(N-i);
            exchange(numbers, i+left, j+left);
        }
    }
    private static void exchange(Double[] numbers, int i, int j){
        double temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public static void main(String[] args) {
        Double[] numbers = getKSortedData(1000, 15);
        for(int i = 0; i < 100; i++)
            System.out.printf("%5.3f ", numbers[i]);
    }
}
