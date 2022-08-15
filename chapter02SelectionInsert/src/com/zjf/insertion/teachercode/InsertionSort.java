/**
 * description:  插入排序的实现
 * date:         2022/8/15 21:18
 * author        ZhuJunfei
 */

package com.zjf.insertion.teachercode;


import com.zjf.selection.demo01.UsingGeneric;
import com.zjf.utils.ArrayGenerator;
import com.zjf.utils.SortingHelper;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
//        method1();
//        testSelectionInsert();
        Integer[] arr = {6, 1, 3, 2, 4, 5};
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("Using selection sort");
        UsingGeneric.sort(arr);
        System.out.println("Using Insertion sort");
        InsertionSort.sort2(arr2);


    }

    private static void testSelectionInsert() {
        int[] amount = {10000, 100000};
        for (int n : amount) {
            System.out.println("Random Array : ");
            Integer[] arr = ArrayGenerator.generateRandomArray(n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("InsertionSort", arr);
            SortingHelper.sortTest("SelectionSort", arr2);

            System.out.println();

            System.out.println("Ordered Array : ");

            arr = ArrayGenerator.generateOrderedArray(n);
            arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("InsertionSort", arr);
            SortingHelper.sortTest("SelectionSort", arr2);

            System.out.println();
        }
    }

    private static void method1() {
        Integer[] arr = {6, 1, 3, 2, 4, 5};
        System.out.println("Using insert sort");
        InsertionSort.sort3(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 1; --j) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    // 代码执行至此, 表示 j 指向的元素 < j - 1指向的元素
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 1 && (arr[j].compareTo(arr[j - 1]) < 0); --j) {
                // 代码执行至此, 表示 j 指向的元素 < j - 1指向的元素
                swap(arr, j, j - 1);
            }
            System.out.println("\t--> 第" + (i + 1) + "次排序: " + Arrays.toString(arr));
        }
    }

    private static <E extends Comparable<E>> void swap(E[] arr, int j, int i) {
        E tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    public static <E extends Comparable<E>> void sort3(E[] arr) {
        // 升序排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 1 && (arr[j].compareTo(arr[j - 1]) > 0); --j) {
                swap(arr, j, j - 1);
            }
        }
    }

}
