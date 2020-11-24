package com.zzj.solution.easy.implementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zengzhongjie
 * @date 2020/11/24
 */
class MyStack {

    private Queue<Integer> a;
    private Queue<Integer> b;

    /** Initialize your data structure here. */
    public MyStack() {
        a = new LinkedList<Integer>();
        b = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        a.offer(x);
        // 将b队列中元素全部转给a队列
        while(!b.isEmpty()) {
            a.offer(b.poll());
        }
        // 交换a和b,使得a队列没有在push()的时候始终为空队列
        Queue temp = a;
        a = b;
        b = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return b.poll();
    }

    /** Get the top element. */
    public int top() {
        return b.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return b.isEmpty();
    }
}
