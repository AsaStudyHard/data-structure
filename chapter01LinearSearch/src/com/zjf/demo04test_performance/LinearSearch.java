package com.zjf.demo04test_performance;

/**
 * description:  custom class linear search
 * date:         2022/7/31 13:42
 * author        ZhuJunfei
 */


public class LinearSearch {
    // search具体逻辑实现
    public static <E> int search(E[] arr, E dst) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(dst)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] dataSize = {1000000, 10000000};
        for (int n : dataSize) {
            Integer[] array = ArrayGenerator.generateOrderedArray(n);

            long startTime = System.nanoTime();
            for (int i = 0; i < 100; i++){
                LinearSearch.search(array, n);
            }
            long endTime = System.nanoTime();
            double elapsedTime = (endTime - startTime) / 1000000.0 / 100.0;
            System.out.println("n = " + n + ", elapsedTime = " + elapsedTime + " ms, 100 runs");
        }
    }
}
