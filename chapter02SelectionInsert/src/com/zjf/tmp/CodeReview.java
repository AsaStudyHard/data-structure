/**
 * description:  代码复习
 * date:         2022/8/14 20:52
 * author        ZhuJunfei
 */

package com.zjf.tmp;

import com.zjf.utils.ArrayGenerator;

import java.util.Arrays;

public class CodeReview {
    public static void swap(Integer [] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void selectSort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int mixIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[mixIndex] > arr[j]) {
                    mixIndex = j;
                }
            }
            if (mixIndex != i){
                swap(arr, mixIndex, i);
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        Integer[] array = ArrayGenerator.generateRandomArray(10);
        System.out.println(Arrays.toString(array));
        selectSort(array);
    }


}
