/**
 * description:  数组实现的栈
 * date:         2022/8/26 21:23
 * author        ZhuJunfei
 */

package com.zjf.stack;

import com.zjf.Array;
import com.zjf.Stack;

public class ArrayStack<E> implements Stack<E> {
    private Array<E> data = new Array<>();

    @Override
    public void push(E e) {
        data.addFirst(e);
    }

    @Override
    public E pop() {
        return data.removeFirst();
    }

    @Override
    public E peek() {
        return data.get(0);
    }

    @Override
    public int getSize() {
        return data.getSize();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(String.format("Stack "))
    }

}
