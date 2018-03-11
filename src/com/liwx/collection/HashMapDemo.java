package com.liwx.collection;

/**
 * @author liwenxing
 * @date 2017/12/29 16:41
 */
public class HashMapDemo {
    public static void main(String[] args) {
        int n = 539458934;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 1;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 2;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 4;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 8;
        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 16;
        System.out.println(Integer.toBinaryString(n));
    }
}
