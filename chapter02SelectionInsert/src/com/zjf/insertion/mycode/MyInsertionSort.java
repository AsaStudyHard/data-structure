/**
 * description:  自己实现的插入排序
 * date:         2022/8/14 21:46
 * author        ZhuJunfei
 */

package com.zjf.insertion.mycode;

import java.util.Arrays;

public class MyInsertionSort {
    public static <E extends Comparable<E>> void sort(E[] arr){
        for (int i = 0; i < arr.length; i++) {
            int station = i;
            for (int j = i - 1; j >= 0; --j){
                if (arr[j].compareTo(arr[station]) > 0){
                    E tmp = arr[station];
                    arr[station] = arr[j];
                    arr[j] = tmp;
                    station = j;
                }else {
                    break;
                }
            }
            System.out.println("\t第 " + i + " 次 --> " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {6, 1, 3, 2, 4, 5};
        System.out.println("Using insert sort");
        MyInsertionSort.sort(arr);
    }

}
