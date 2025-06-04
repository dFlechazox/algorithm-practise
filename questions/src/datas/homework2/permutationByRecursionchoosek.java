package datas.homework2;
import java.util.ArrayList;
import java.util.List;

public class permutationByRecursionchoosek {
    public static void doit(char[] chars, int n) {
        //判断非法输入
        if (n <= 0 || chars == null) {
            return;
        }
        //新建一个集合，里面存放字符数组
        List<Character> charList = new ArrayList<>();
        //初始化要输出的序列长度
        for (int i = 0; i < n; i++) {
            charList.add('#');
        }
        listAll(charList, chars, n);
    }
    public static void listAll(List<Character> list, char[] chars, int n) {
        if (n == 0) {
            System.out.println(list);                  // 输出一种可能的排列
            return;
        }

        for (char aChar : chars) {                      // 暴力尝试
            if (!list.contains(aChar)) {                // 若List中不包含这一位元素
                list.set(list.size() - n, aChar);       // 将当前元素加入
            } else {                                    // 否则跳到下一位
                continue;
            }
            listAll(list, chars, n - 1);                // 下一位
            list.set(list.size() - n, '#');             // 还原
        }
    }
    public static void main(String[] args) {
        //  以字符数组承载总的字符集合
        char[] chars = {'a', 'b', 'c', 'd'};
        doit(chars, 2);
    }
}

