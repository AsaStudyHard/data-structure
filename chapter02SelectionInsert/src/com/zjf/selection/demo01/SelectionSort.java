/**
 * description:  selection sort implement
 * date:         2022/7/31 19:04
 * author        ZhuJunfei
 */

package com.zjf.selection.demo01;

import java.util.Arrays;

public class SelectionSort {

        public static void sort(Integer[] arr) {
            for (int i = 0; i < arr.length; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]){
                        minIndex = j;
                    }
                }
                if(minIndex != i){
                    int min = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = min;
                }
                System.out.println("\t第 " + i + " 次 --> " + Arrays.toString(arr));
            }
        }

        public static void main(String[] args) {
            Integer[] arr = {6, 1, 3, 2, 4, 5};
            System.out.println("Using select sort");
            SelectionSort.sort(arr);
//            System.out.println(Arrays.toString(arr));

        }
}
