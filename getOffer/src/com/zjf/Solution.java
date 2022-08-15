/**
 * description:  剑指offer题解
 * date:         2022/8/12 23:29
 * author        ZhuJunfei
 */

package com.zjf;

import java.util.*;

public class Solution {
    /**
     * 剑指 Offer 03. 数组中重复的数字
     * @param nums 数组
     * @return 重复的元素
     */
    public int findRepeatNumber(int[] nums) {

        // 一开始的想法就是直接塞到一个hashMap中, 把元素作为key, 出现次数作为value
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            if (!hm.containsKey(i)){
                hm.put(i, 1);
            }else {
                return i;
            }
        }
        return -1;
    }
    public static void eating(Animal a){
        a.eat();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        eating(dog);
        eating(cat);
    }

}
class Animal{
    public void eat(){
        System.out.println("This is Animal eat function");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("This is Dog eat function");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("This is Cat eat function");
    }
}


