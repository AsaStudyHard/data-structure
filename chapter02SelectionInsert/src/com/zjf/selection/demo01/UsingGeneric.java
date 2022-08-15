/**
 * description:  using generic  optimizing
 * date:         2022/7/31 20:17
 * author        ZhuJunfei
 */

package com.zjf.selection.demo01;

import com.zjf.domain.Student;

import java.util.Arrays;

public class UsingGeneric {
    private UsingGeneric() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(arr, minIndex, i);

            }
            System.out.println("\t--> 第" + (i + 1) + "次排序: " + Arrays.toString(arr));
        }
    }

    private static <E> void swap(E[] arr, int minIndex, int i) {
        E min = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = min;
    }

    public static void main(String[] args) {

        Student[] stus = {
                new Student("Tom", 88),
                new Student("Rose", 99),
                new Student("Jerry", 100),
                new Student("Alice", 98),
                new Student("Tom", 100)
        };
        UsingGeneric.sort(stus);
        for (Student student : stus) {
            System.out.println(student);
        }
    }
}
