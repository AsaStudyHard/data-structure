/**
 * description:  线性查找法的实现
 * date:         2022/7/31 11:36
 * author        ZhuJunfei
 */

package com.zjf.demo01imple_search;


public class LinearSearch {
    // 禁止用户创建类对象
    private LinearSearch() {}
    // search具体逻辑实现
    public static int search(int[] arr, int dst) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dst) {
                return i;
            }
        }
        return -1;
    }
    // 测试用例
    public static void main(String[] args) {
        int[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        int search = LinearSearch.search(data, 16);
        System.out.println(search);

        int res = LinearSearch.search(data, 666);
        System.out.println(res);
    }
}
