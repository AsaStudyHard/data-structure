/**
 * description:  二分法的算法题
 * date:         2022/8/12 21:00
 * author        ZhuJunfei
 */

package com.zjf.dichotome;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Solution {
//    public static int search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        int mid = 0;
//
//        while (left <= right) {
//            mid = left + (right - left) / 2;
//
//            if (nums[mid] == target) {
//                return mid;
//            }
//            if (nums[mid] > target) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return -1;
//    }

    public static String arrangeWords(String text) {
        /*
        首字母大写先不考虑, 对字符进行排序,
        首先可以进行字符串的切割, 使用hash?, 但这样不行, 因为hash的key要求唯一.
        使用列表, 相当于对元素进行排序, 使用插入排序, 或者选择排序?
        */
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; ++i) {
            for (int j = i; j >= 1 && (words[j].length() < words[j - 1].length()); j--) {
                // 交换数据
                String tmp = words[j];
                words[j] = words[j - 1];
                words[j - 1] = tmp;
            }
        }
//        System.out.println(Arrays.toString(words));
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                // 首字母大写
                String title = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
                stringBuffer.append(title);
                continue;
            }
            if (i == words.length - 1) {
                stringBuffer.append(word.toLowerCase());
                continue;
            }
            stringBuffer.append(word.toLowerCase()).append(" ");
        }

        return stringBuffer.toString();
    }

    public static String arrangeWords2(String text) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, String> map = new HashMap<>();
        // 首字母转换为小写
        text = text.substring(0, 1).toLowerCase() + text.substring(1);
        //添加到map中
        String[] texts = text.split(" ");
        for (String s : texts)
            // 注意put存放的值, 很有意思, 灵魂所在
            map.put(s.length(), map.getOrDefault(s.length(), "") + s + " ");
        //遍历键
        int[] keys = new int[map.size()];
        int idx = 0;
        for (Integer key : map.keySet()) keys[idx++] = key;
        Arrays.sort(keys);
        for (int key : keys) sb.append(map.get(key));
        // 首字母转换为大写
        String res = sb.toString();
        res = res.substring(0, 1).toUpperCase() + res.substring(1, res.length() - 1);
        return res;
    }

    public static void main(String[] args) {
//        int[] nums = {-1, 0, 3, 5, 9, 12};
//        int target = 13;
//        int search = search(nums, target);
//        System.out.println(search);
        String text = "To be or not to be";
        System.out.println(arrangeWords(text));
    }
}
