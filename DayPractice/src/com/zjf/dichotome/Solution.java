/**
 * description:  二分法的算法题
 * date:         2022/8/12 21:00
 * author        ZhuJunfei
 */

package com.zjf.dichotome;

public class Solution {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 13;
        int search = search(nums, target);
        System.out.println(search);
    }
}
