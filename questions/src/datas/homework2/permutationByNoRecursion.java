package datas.homework2;

public class permutationByNoRecursion {
    public static void main(String[] args){
        char[] str ={'a','b','c','e'};
        printAllStrs(str);
    }
    private static void printCharArr(char[] str) {
        for (char c : str) {
            System.out.print(c + " ");
        }
        System.out.print("\n");
    }
    public static void printAllStrs(char[] str){
        while (true){
            //先找到最后一个递增的位置
            int i = str.length-2;
            while (i>=0&&str[i]>str[i+1]){
                i--;
            }
            if(i<0){
                break;
            }
            char tmp = str[i];
            //将该位置数据和 右侧比起大的最小值进行交换
            char smallerValue = str[i+1];
            int smallerIndex= i+1;
            for (int start = i+1;start<str.length;start++){
                if(str[start]>tmp&&smallerValue>str[start]){
                    smallerIndex = start;
                    smallerValue = str[start];
                }
            }
            //交换
            str[i] = str[smallerIndex];
            str[smallerIndex] = tmp;
            int startIndex = i+1;

            int postPtr = str.length-1;
            //将该位置的往后的数据进行翻转
            while (startIndex<postPtr){
                char tmp2 = str[startIndex];
                str[startIndex] =str[postPtr];
                str[postPtr] = tmp2;
                startIndex++;
                postPtr--;
            }
            //打印数据
            printCharArr(str);
        }
    }
}
