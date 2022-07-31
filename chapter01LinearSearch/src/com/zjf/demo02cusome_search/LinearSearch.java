/**
 * description:  custom class linear search
 * date:         2022/7/31 13:42
 * author        ZhuJunfei
 */

import com.zjf.demo02cusome_search.Student;


public class LinearSearch {
    // search具体逻辑实现
    public static <E> int search(E[] arr, E dst) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(dst)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Student[] stus = {new Student("Alice"),
                        new Student("Bob"),
                        new Student("Joy")};

        Student dest = new Student("bob");
        int res = LinearSearch.search(stus, dest);
        System.out.println(res);

    }
}
