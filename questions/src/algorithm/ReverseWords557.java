package algorithm;

public class ReverseWords557 {
    public static String reverseWords(String s){              //Java中Sting是不可变类型，必须使用一个新的字符串
        StringBuffer ret = new StringBuffer();
        int n = s.length();
        int i = 0;
        while (i < n){
            int start = i;
            while (i < n && s.charAt(i) != ' '){
                i++;
            }
            for (int j = start;j < i;j++){
                ret.append(s.charAt(i-1-j+start));
            }
            while (i < n && s.charAt(i) == ' ') {
                i++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }
}
