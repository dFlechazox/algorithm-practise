package datas.exercise;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingStack {
    Deque<Integer> instack;
    Deque<Integer> outstack;
    public QueueUsingStack() {
        instack = new LinkedList<Integer>();
        outstack = new LinkedList<Integer>();
    }

    public void push(int x) {
        instack.push(x);
    }

    public int pop() {
        if (outstack.isEmpty()){
            in2out();
        }
        return outstack.pop();
    }

    private void in2out() {                   //用instack给outstack赋值
    }

    public int peek() {
        if (outstack.isEmpty()){
            in2out();
        }
        return outstack.peek();
    }

    public boolean empty() {
        return instack.isEmpty() && outstack.isEmpty();
    }
}
