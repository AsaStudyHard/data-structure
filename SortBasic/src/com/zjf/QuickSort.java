/**
 * description:  快速排序
 * date:         2022/8/13 20:46
 * author        ZhuJunfei
 */

package com.zjf;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void quick(int [] arr, int l, int h){
        // 进行递归排序
        if(l >= h){
            // 退出循环条件
            return;
        }
        int pv = partition(arr, l, h);
        quick(arr, l, pv - 1);
        quick(arr, pv + 1, h);
    }

    /**
     * 分区函数,
     *
     * @param arr 被分区的数组
     * @param l   左边界
     * @param h   右边界
     * @return 基准点
     */
    public static int partition(int[] arr, int l, int h) {
        // 选择右边的元素为基准点
        int pv = arr[h];
        int i = l;
        for (int j = l; j < h; j++){
            // 比较j指向的元素和基准点元素的大小, 因为h位置的元素是基准点, 所以不需要比较
            if(arr[j] < pv){
                if (i != j){
                    swap(arr, i, j);
                }
                i++;
            }
        }
        // 交换基准点和i最后指向的位置
        if (i != h){
            swap(arr, i, h);
        }
        System.out.println(Arrays.toString(arr) + " i = " + i);
        return i;
    }

    public static void main(String[] args) {
        int [] arr = {5, 3, 7, 2, 9, 8, 1, 4};
        quick(arr, 0, arr.length - 1);
    }

}
