/**
 * description:  使用泛型对代码进行优化
 * date:         2022/7/31 12:29
 * author        ZhuJunfei
 */

package com.zjf.demo01imple_search;

public class Demo02UsingGeneric {

    // search具体逻辑实现
    public static <E> int search(E[] arr, E dst) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(dst)) {
                return i;
            }
        }
        return -1;
    }
    // 测试用例
    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};

        int search = Demo02UsingGeneric.search(data, 16);
        System.out.println(search);

        int res = Demo02UsingGeneric.search(data, 666);
        System.out.println(res);
    }
}
