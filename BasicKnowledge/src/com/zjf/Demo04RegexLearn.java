package com.zjf;

import java.util.regex.Pattern;

public class Demo04RegexLearn {
    public static void main(String[] args) {
        String email = "abc1234@abc123.com";
        String r = "[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]+";
        System.out.println(Pattern.matches(r, email));
    }
}
