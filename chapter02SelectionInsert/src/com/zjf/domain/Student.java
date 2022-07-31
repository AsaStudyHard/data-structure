/**
 * description:  student class
 * date:         2022/7/31 13:36
 * author        ZhuJunfei
 */

package com.zjf.domain;

public class Student implements Comparable<Student> {

    private String name;
    private Integer score;

    public Student(String name, Integer score ) {
        this.name = name;
        this.score = score;
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


    @Override
    public int compareTo(Student another) {
        // this表示自己, o表示下一个元素
        int res = this.name.compareTo(another.name);
        res = res == 0 ? this.score - another.score : res;
        return res;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
