package com.zjf;

import java.math.BigDecimal;

public class Demo02BigNumAdd {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("123456789");
        BigDecimal num2 = new BigDecimal("987654321");

        System.out.printf("%s + %s = %s \n", num1.toString(), num2.toString(), num1.add(num2).toString());
    }
}
