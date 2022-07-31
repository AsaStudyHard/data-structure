/**
 * @Description: 大炮打蚊子练习
 */

package com.zjf;

import java.util.Arrays;
import java.util.Scanner;

public class Demo03GunsToMosquitoes {


    /*
5 6
00#00#
000###
00#000
000000
00#000
2
1 2
1 4


输出
0 2
     */
    // 1. 创建装数据的容器, 最大值为20
    static int[][] board = new int[20][20];
    static int m;
    static int n;

    public static void main(String[] args) {
        // 2. 获取用户输入的边界值
        // 2.1 创建屏幕数据获取对象
        Scanner sc = new Scanner(System.in);
        String mAndN = sc.nextLine();
        String[] s = mAndN.split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);

        // 3. 获取用户输入的具体的数据, 放入容器中
        // 3.1 对数据进行清洗, 放入上面的二维数组中
        for (int i = 0; i < m; i++) {
            String line = sc.nextLine();
            String[] chars = line.split("");
            for (int j = 0; j < n; j++) {
                // 切割字符串
                board[i][j] = chars[j].equals("0") ? 0 : 2;
            }
        }

        // 4. 获取用户输入的炮弹的个数
        int guns = Integer.parseInt(sc.nextLine());
        System.out.println("guns = " + guns);
        for (int i = 0; i < guns; i++) {
            // 5. 获取用户输入的炮弹坐标, 与蚊子的位置进行比对
            int x, y;
            String[] gunsPlace = sc.nextLine().split(" ");
            x = Integer.parseInt(gunsPlace[0]);
            y = Integer.parseInt(gunsPlace[1]);
            int count = 0;
            // 获取炮弹辐射的坐标, 并进行判断
            for (int xR = x - 1; xR < x + 2; ++xR) {
                if (xR == x) {
                    // x上下范围
                    for (int yR = y - 1; yR < y + 2; ++yR) {
                        if (yR == y) {
                            count += bang(xR, yR, 2);
                        } else {
                            count += bang(xR, yR, 1);
                        }
                    }
                } else {
                    // x左右两边
                    count += bang(xR, y, 1);
                }
            }
            System.out.printf("%d ", count);
        }
    }

    private static int bang(int xR, int yR, int kill) {
        /*
        进行炮弹的范围伤害判定
         */
        // 进行x, y 的边界的判断, 防止越界, 同时判断 Mosquito 是否有血
        if ((xR > 0 && xR < m && 0 < yR && yR < n) && (board[xR][yR] > 0)) {
            board[xR][yR] -= kill;
            if (board[xR][yR] <= 0) {
                // 代码执行至此, 表示打死蚊子了
                return 1;
            } else {
                return 0;
            }
        } else {
            // 表示这个位置没有蚊子, 或者索引越界了
            return 0;
        }
    }
}
