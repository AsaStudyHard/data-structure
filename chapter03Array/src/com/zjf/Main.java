/**
 * description:  测试自定义的数据结构
 * date:         2022/8/26 19:36
 * author        ZhuJunfei
 */

package com.zjf;

public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<Integer>();
        for (int i = 0; i < 10; ++i){
            arr.add(i, 10 + i);
        }
        System.out.println(arr);
        arr.addFirst(-1);
        System.out.println(arr);
        arr.addLast(-199);
        System.out.println(arr);

        arr.remove(0);
        System.out.println(arr);
        arr.remove(0);
        arr.remove(0);
        arr.remove(0);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);

        arr.removeLast();
        System.out.println(arr);
        arr.removeElement(19);
        System.out.println(arr);
        arr.removeLast();
        System.out.println(arr);
        arr.removeLast();
        System.out.println(arr);
        arr.removeLast();
        System.out.println(arr);
        arr.removeLast();
        System.out.println(arr);
        arr.removeLast();
        System.out.println(arr);


    }
}
