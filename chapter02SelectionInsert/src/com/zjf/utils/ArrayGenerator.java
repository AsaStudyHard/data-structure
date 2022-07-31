/**
 * description:  array generator
 * date:         2022/7/31 17:31
 * author        ZhuJunfei
 */

package com.zjf.utils;

import java.util.Random;

public class ArrayGenerator {
    private ArrayGenerator() {
    }

    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static Integer[] generateRandomArray(int n) {
        Integer[] arr = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }
        return arr;
    }
}
