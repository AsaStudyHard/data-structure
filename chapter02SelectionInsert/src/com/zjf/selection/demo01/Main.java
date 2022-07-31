/**
 * description:  test sort
 * date:         2022/7/31 21:02
 * author        ZhuJunfei
 */

package com.zjf.selection.demo01;

import com.zjf.utils.ArrayGenerator;
import com.zjf.utils.SortingHelper;

public class Main {
    public static void main(String[] args) {
        int [] dataSize = {10000, 100000};
        for (int i : dataSize){
            Integer[] array = ArrayGenerator.generateRandomArray(i);
            SortingHelper.sortTest("SelectionSort", array);
        }
    }
}
