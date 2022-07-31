package com.zjf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: java实现二维数组
 */

public class TwoDimensionArray {
    public static void main(String[] args) {
        // 二维数组, 也就是数组的数组
        int[][] td = new int[4][];
        td[0] = new int[3];
        td[1] = new int[5];
        int first_line = td[0].length;
        int second_line = td[1].length;
        for (int i = 0; i < first_line; ++i)
        {
            td[0][i] = i ^ 2;  // 这是异或运算
        }

        for (int i = 0; i < second_line; ++i)
        {
            td[1][i] = i * i;
        }

        for (int i = 0; i < first_line; ++i) {
            System.out.printf("td[0][%d] = %d \n", i, td[0][i]);
        }
        System.out.println("second row");
        for (int i = 0; i < second_line; ++i) {
            System.out.printf("td[1][%d] = %d \n", i, td[1][i]);
        }
    }

}
