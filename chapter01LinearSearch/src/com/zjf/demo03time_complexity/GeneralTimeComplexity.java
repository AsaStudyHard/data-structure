/**
 * description:  常见的时间复杂度
 * date:         2022/7/31 16:51
 * author        ZhuJunfei
 */

package com.zjf.demo03time_complexity;


public class GeneralTimeComplexity {
    static int n = 1000;

    public static void main(String[] args) {
        on2();
    }

    private static void on2() {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println(i + j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + j);
            }
        }
    }

    private static void ologn() {
        for (int i = 0; i < n; i *= 2) {
            // logn的循环
            System.out.println("hey - I'm looking at: " + i);
        }

        while (n != 0) {
            // 获取数字n的二进制位数
            int bit = n % 2;
            n /= 2;
        }
    }

    private static void on(){
        for (int i = 0; i < n; ++i){
            if (n % i == 0){
                // i 是 n 的一个约数
            }
        }
        // 经过相关数学的验证有
        for (int i = 0; (i * i) < n; ++i){
            if (n % i == 0){
                // i 是 n 的一个约数
            }
        }

    }

}
