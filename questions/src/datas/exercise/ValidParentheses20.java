package datas.exercise;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses20 {
    public boolean isValid(String s){
        int n = s.length();
        if (n%2 == 1){
            return false;
        }
        HashMap<Character,Character> pair = new HashMap<>(){
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };
        Stack<Character> stack = new Stack<>();                                //Deque<Character> stack = new LinkedList<Character>(); ?  不建议使用stack
        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if (pair.containsKey(ch)){
                if (stack.isEmpty() || stack.peek() != ch){
                    return false;
                }
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
