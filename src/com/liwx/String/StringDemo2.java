package com.liwx.String;

/**
 * @author liwenxing
 * @date 2017/12/28 15:01
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "a";
        final int i1 = 1;
        String s2 = "a" + i1;
        String s3 = "a1";
        int i2 = 1;
        String s4 = "a" + i2;
        final int i3 = 500;
        String s5 = "a" + i3;
        String s6 = "a500";
        final String s7  = "aaa";
//        String s8 = "bbb";
        String s9 = s7 + "bbb";
        String s10 = "aaabbb";
        System.out.println(s2 == s3);
        System.out.println(s4 == s3);
        System.out.println(s5 == s6);
        System.out.println(s9 == s10);
    }
}
