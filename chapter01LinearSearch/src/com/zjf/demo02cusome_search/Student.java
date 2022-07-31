/**
 * description:  student class
 * date:         2022/7/31 13:36
 * author        ZhuJunfei
 */

package com.zjf.demo02cusome_search;

import java.util.Locale;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object student) {
        if (student == this) {
            return true;
        }
        if (student == null) {
            return false;
        }
        if (this.getClass() != student.getClass()) {
            return false;
        }
        Student another = (Student) student;
        // 底层调用 String 类型的equals方法
        return this.name.toLowerCase().equals(another.name.toLowerCase());
    }
}
