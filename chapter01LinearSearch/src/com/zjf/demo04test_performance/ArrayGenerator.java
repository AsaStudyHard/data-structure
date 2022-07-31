/**
 * description:  array generator
 * date:         2022/7/31 17:31
 * author        ZhuJunfei
 */

package com.zjf.demo04test_performance;

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
}
