package od;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Height {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int n = sc.nextInt();

        Integer[] height = new Integer[n];
        for (int i = 0; i < n; i ++){
            height[i] = sc.nextInt();
        }
        System.out.println(getResult(h,height));
    }

    public static String getResult(int h, Integer[] height){
        Arrays.sort(
                height,
                (a, b) -> {
                    int absA = Math.abs(a - h);
                    int absB = Math.abs(b - h);
                    if (absA != absB){
                        return absA - absB;
                    }
                    else {
                        return a - b;
                    }
                }
        );

        StringJoiner sj = new StringJoiner(" ");
        for (Integer i : height){
            sj.add(i.toString());
        }
        return sj.toString();
    }
}
