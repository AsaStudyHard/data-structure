/**
 * description:
 * 1.合并有序数组( https://leetcode.cn/problems/merge-sorted-array/ )
 * 2.
 * date:         2022/8/12 14:00
 * author        ZhuJunfei
 */

package com.zjf.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        createNewSpace(nums1, m, nums2, n);
        /*
        方案二: 基于nums1原空间进行插入, 但是我们需要注意的是, 需要从大开始插入
         */
        int k = n + m - 1;
        int i = m - 1;
        int j = n - 1;

        for (; k >= 0; --k) {
            if (j < 0 || (i >= 0 && nums1[i] >= nums2[j])) {
                nums1[k] = nums1[i--];

            } else {
                nums1[k] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));

    }

    private static void createNewSpace(int[] nums1, int m, int[] nums2, int n) {
    /*
    方案一:
        创建一份新的数组, 用于接收合并的数组的数据
        1. 使用一个i指针, 指向nums1, 使用一个j指针, 指向nums2
        2. 比较i指向的数据和j指向的数据, 谁小, 就保存谁. 并把指针向下移动一位
        3. 上面的是逻辑的主题, 现在考虑算法的细节
        4. i, j可以会出现越界的状况, 因此需要对i, j判断

        根据条件可知, m + n > 1
     */
        if (m == 0) {
            int index = 0;
            // 把nums2copy to nums1
            while (index < n) {
                nums1[n] = nums2[n];
                n++;
            }
            return;
        }
        if (n == 0) {
            return;
        }


        int[] nums3 = new int[m + n];
        int k = 0;
        int i = 0;
        int j = 0;


        // 表示数组一不为null
        for (k = 0; k < m + n; ++k) {
            if (j >= n || (nums1[i] <= nums2[j] && i < m)) {
                // 代表此时nums1中的数据比nums2小
                nums3[k] = nums1[i];
                i++;
            } else {
                nums3[k] = nums2[j];
                j++;
            }
        }
        //        System.out.println(Arrays.toString(nums3));
        k = 0;
        while (k < m + n) {
            nums1[k] = nums3[k];
            k++;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static int removeDuplicates(int[] nums) {
        /*
        这类问题就是我们一个数组中的数字该不该留下
        主题思路就是
                1. 判断去除元素的逻辑, if nums[i - 1] == nums[i], 则后面的元素向前覆盖
        */
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || (nums[i] != nums[k - 1])) {
                // 后面的元素向前覆盖
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void moveZeroes(int[] nums) {
        // 与上一个题目类似, 我们需要保留我们需要的数据
        int[] new_nums = new int[nums.length];
        int n = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[n++] = i;
            }
        }
        while (n < nums.length) {
            nums[n++] = 0;
        }

    }


    public static void main(String[] args) {
//        testMergeCode();
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void testMergeCode() {
        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);

        int[] nums3 = {0};
        int m1 = 1;
        int[] nums4 = {};
        int n1 = 0;
        merge(nums3, m1, nums4, n1);
    }
}
