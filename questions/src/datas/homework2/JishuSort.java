package datas.homework2;

import java.util.Arrays;

public class JishuSort {
    public static void LSD(int[] num) {
        //对数字采用最低位优先法排序
        Queue queue = new Queue();//分配10个队列
        int digits = getNumDigits(num);
        int mode = 1;
        while (digits != 0) {
            for (int i = 0; i < num.length; i++) {
                queue.enqueue((num[i] / mode) % 10);
                //按桶分配,(num[i]/mode)%10表示取的位数
            }
            int k = 0;
            for (int j = 0; j < 10; j++) {
                while (!queue.isEmpty()) {
                    num[k] = (int) queue.dequeue();
                    k++;
                }
            }//出队
            digits--;//位上移
            mode = mode * 10;
        }
    }

    public static void LSD(String[] str) {
        //对字符串采取最低位优先法
        //对数字采用最低位优先法排序
        Queue queue = new Queue();//分配27个队列
        //27个桶，其中第27个桶用来存储除字母以外的其他字符，不区分大小写
        int digits = str[0].length();//等长字符的长度
        int mode = 1;
        while (digits != 0) {
            for (int i = 0; i < str.length; i++) {
                int index;//桶的下标
                if (str[i].charAt(digits - 1) >= 'A' && str[i].charAt(digits - 1) <= 'Z') {
                    index = str[i].charAt(digits - 1) - 'A';
                } else if (str[i].charAt(digits - 1) >= 'a' && str[i].charAt(digits - 1) <= 'z') {
                    index = str[i].charAt(digits - 1) - 'a';
                } else {
                    index = 26;
                }//不区分大小写
                queue.enqueue(index);
                //按桶分配
            }
            int k = 0;
            for (int j = 0; j < 27; j++) {
                while (!queue.isEmpty()) {
                    str[k] = (String) queue.dequeue();
                    k++;
                }
            }//出队
            digits--;//位上移
        }
    }

    static int getNumDigits(int[] num) {//获得最大的数的位数
        int max = num[0];//最大的数
        int digits = 0;//位数
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) max = num[i];
        }
        while (max / 10 != 0) {
            digits++;
            max = max / 10;
        }
        if (max % 10 != 0) {
            digits++;
        }
        return digits;
    }


    public static void main(String[] args) {
        int[] num = {12, 32, 2, 231, 14, 23};
        System.out.println("before sorting: " + Arrays.toString(num));
        LSD(num);
        System.out.println("after sorting: " + Arrays.toString(num));
        String[] strings = {"abc", "bde", "fad", "abd", "bef", "fdd ", "abe" };
        System.out.println("before sorting: " + Arrays.toString(strings));
        LSD(strings);
        System.out.println("after sorting: " + Arrays.toString(strings));
    }
}
