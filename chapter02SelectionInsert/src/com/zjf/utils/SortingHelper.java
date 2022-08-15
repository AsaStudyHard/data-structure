/**
 * description:  sorting helper
 * date:         2022/7/31 20:54
 * author        ZhuJunfei
 */

package com.zjf.utils;

import com.zjf.insertion.teachercode.InsertionSort;
import com.zjf.selection.demo01.UsingGeneric;

public class SortingHelper {
    public static <E extends Comparable<E>> boolean isSorted(E[] arr){
        for (int i = 0; i < arr.length - 1; ++i){
            if (arr[i].compareTo(arr[i + 1]) > 0){
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr){
        long startTime = System.nanoTime();
        if(sortName.equals("SelectionSort")){
            UsingGeneric.sort(arr);
        }
        if (sortName.equals("InsertionSort")){
            InsertionSort.sort2(arr);
        }
        long endTime = System.nanoTime();

        double time = (endTime - startTime) / 1000000000.0;

        if (!SortingHelper.isSorted(arr)){
            throw new RuntimeException(sortName + "failed");
        }
        System.out.printf("data size = %d, run time = %f, sorting name = %s \n", arr.length, time, sortName);
    }

}
