package algorithm;

public class AlgorithmTest1 {
    public static int solve(int n) {
        if (n == 0) return 1;
        int sum = 0;
        for (int i = 0; i <= (n / 2); i++)
            sum += solve(i);
        return sum;
    }
}    

