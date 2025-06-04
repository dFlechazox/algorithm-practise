package datas.homework2;

import java.util.NoSuchElementException;

public class Queue<T> implements QueueADT<T> {
    private static  int N =1;
    //定义顺序队
    private static final int DEFAULT_SIZE=N;
    private int max_size;//定义队列的实际最大容纳量+1
    private int size;//队列中实际的元素个数
    private int front;//队首元素的前驱元素下标
    private int rear;//队尾元素下标
    private T[] listArray;//存储元素的下标

    private void setUp(int size){
        this.max_size=size+1;
        front=rear=0;
        listArray=(T[])new Object[size+1];
    }

    public Queue() {
        setUp(DEFAULT_SIZE);
    }
    public Queue(int size){
        setUp(size);
    }

    @Override
    public void clear() {//清空队列元素
        front=rear=0;
    }

    @Override
    public void enqueue(T it) {//进队
        if (isFull()){
            System.out.println("queue is full!");
            N = 2*N+1;//队列已经满了,增加容量
        }
        rear=(rear+1)%max_size;
        listArray[rear]=it;
        this.size++;
        try {
            it = null;
        }
        catch (IllegalArgumentException e){
            System.out.println("元素无意义");
        }
    }

    @Override
    public T dequeue() {//出队
        /*if (isEmpty()){
            System.out.println("queue is empty");
            return null;
        }*/
        try{
            isEmpty();
        }
        catch (NoSuchElementException e){
        }
        front=(front+1)%max_size;
        size--;
        if (size == N/4){
            N = N/2;
        }
        return listArray[front];
    }

    @Override
    public T firstValue() {
        if (isEmpty()){
            System.out.println("queue is empty");
            return null;
        }
        return listArray[(front+1)%max_size];
    }

    @Override
    public boolean isEmpty() {
        return front==rear;
    }

    @Override
    public boolean isFull() {
        return front==(rear+1)%max_size;
    }

    @Override
    public void print() {
        if (isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        int temp= front+1;
        while((temp%max_size)!=rear){
            System.out.print(listArray[temp]+" ");
            temp++;
        }
        System.out.println(listArray[temp]);
    }

    @Override
    public int size() {
        return this.size;
    }


}

