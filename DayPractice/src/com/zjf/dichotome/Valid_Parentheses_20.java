/**
 * description:  有效地括号https://leetcode.cn/problems/valid-parentheses/
 * date:         2022/8/18 22:24
 * author        ZhuJunfei
 */

package com.zjf.dichotome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Valid_Parentheses_20 {
    public static boolean isValid(String s) {
        /*
        给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。

        要求我们必须要按照正确的顺序闭合括号, 所以我们可以直接使用栈这种数据结构哦
        */
        Stack<Character> valids = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++){
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{'){
                valids.push(chars[i]);
                continue;
            }
            if (valids.isEmpty()) {
                return false;
            }
            // 代码执行至此, 表示stack一定有元素
            Character peek = valids.pop();
            if (chars[i] == ')' && peek != '('){
                return false;
            }
            if (chars[i] == ']' && peek != '['){
                return false;
            }
            if (chars[i] == '}' && peek != '{'){
                return false;
            }
        }
        return valids.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(()"));
        ArrayList<Integer> arr = new ArrayList<>();
        int [] vals = new int[arr.size()];

    }

}
