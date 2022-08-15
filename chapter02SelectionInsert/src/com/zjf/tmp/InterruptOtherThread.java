/**
 * description:  interrupt other thread
 * date:         2022/8/10 8:57
 * author        ZhuJunfei
 */

package com.zjf.tmp;

import java.util.Scanner;

public class InterruptOtherThread {
    public static void main(String[] args) {
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                System.out.println("this is thread1, start copy file");
                try {
                    // unit millis
                    sleep(1000000);  // 模拟大文件IO
                } catch (InterruptedException e) {
                    System.out.println("执行完毕");
                    System.out.println("current interrupt status: " + currentThread().isInterrupted());
                }
            }
        };

        // thread2 作为打断thread1存在
        Thread t2 = new Thread("t2"){
            @Override
            public void run() {
                System.out.println("this is thread2, will interrupt thread1");

                Scanner sc = new Scanner(System.in);
                byte quite = sc.nextByte();
                if (quite == 1){
                    t1.interrupt();
                    System.out.println("thread is interrupt status: " + t1.isInterrupted());
                }
                System.out.println("thread2 running end");
            }
        };

        // 启动线程
        t1.start();
        t2.start();
    }
}
