package algorithm;

public class ReverseString344 {
    public static void reverseString(char[] s){
        int start = 0, end = s.length-1;
        while (start < end){
            Nomal.swapchar(s,start,end);
            start++;
            end--;
        }
        System.out.print(s);
    }

}
