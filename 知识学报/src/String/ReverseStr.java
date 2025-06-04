package String;

public class ReverseStr {
    public String reverseStr(String s, int k){
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i += 2*k){
            int left = i;
            int right = Math.min(ch.length - 1, left+ k - 1);
            while (left < right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ch);      //return ch.toString();如果一个类没有重写 toString() 方法，调用 toString() 会返回对象的类名和对象的哈希码（内存地址的散列值）
    }
}
