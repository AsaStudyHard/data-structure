/**
 * Description:  栈接口
 * date:         2022/8/26 21:21
 *
 * @author ZhuJunfei
 */

package com.zjf;

public interface Stack <E>{
    void push (E e);

    E pop();

    E peek();

    int getSize();

    boolean isEmpty();
}
